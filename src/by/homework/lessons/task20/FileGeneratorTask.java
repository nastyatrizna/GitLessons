package by.homework.lessons.task20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FileGeneratorTask implements Callable<String> {

    private static final int NUM_LINES = 10;
    private static final int SLEEP_MIN_MS = 1000;
    private static final int SLEEP_MAX_MS = 3000;
    private static final Random RANDOM = new Random();
    private static final AtomicInteger filesCreated = new AtomicInteger(0);

    private String fileName;

    public FileGeneratorTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": Задача началась. Создаем файл: " + fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int j = 0; j < NUM_LINES; j++) {
                String randomString = generateRandomString();
                writer.write(randomString);
                writer.newLine();
            }
            System.out.println(threadName + ": Создан файл " + fileName);
            filesCreated.incrementAndGet();

        } catch (IOException e) {
            System.err.println(threadName + ": Ошибка при создании файла " + fileName + ": " + e.getMessage());
            throw e;
        }

        int sleepTime = RANDOM.nextInt(SLEEP_MAX_MS - SLEEP_MIN_MS + 1) + SLEEP_MIN_MS;
        System.out.println(threadName + ": Засыпаем на " + sleepTime + "ms");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println(threadName + ": Прервано во время сна.");
            Thread.currentThread().interrupt();
        }

        System.out.println(threadName + ": Задача завершена. Создан файл: " + fileName);
        return fileName;
    }

    private String generateRandomString() {
        int stringLength = RANDOM.nextInt(20) + 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {char randomChar = (char) (RANDOM.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int numTasks = 10;
        int threadPoolSize = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        List<String> allFilesCreated = new ArrayList<>();
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 0; i < numTasks; i++) {
            String fileName = "file_" + UUID.randomUUID().toString() + ".txt";
            tasks.add(new FileGeneratorTask(fileName));
        }

        try {
            List<Future<String>> submittedFutures = executorService.invokeAll(tasks);
            for (Future<String> future : submittedFutures) {
                try {
                    String fileName = future.get();
                    if (fileName != null) {
                        System.out.println(Thread.currentThread().getName() + ": Задача выполнена успешно. Файл: " + fileName);
                        allFilesCreated.add(fileName);
                    } else {
                        System.out.println(Thread.currentThread().getName() + ": Задача была прервана или не создала файл.");
                    }
                } catch (InterruptedException | ExecutionException e) {
                    System.err.println(Thread.currentThread().getName() + ": Задача завершилась с ошибкой: " + e.getMessage());
                }
            }
        }  catch (InterruptedException e) { // обработка InterruptedException
            System.err.println("Прервано во время выполнения задач.");
            Thread.currentThread().interrupt();
        } finally {
            executorService.shutdown();

            try {
                if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                    System.err.println("Задачи не завершились вовремя, принудительно завершаем.");
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                System.err.println("Прервано во время ожидания завершения задач.");
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }

            System.out.println(Thread.currentThread().getName() + ": Программа завершена.");
            System.out.println("Общее количество созданных файлов: " + filesCreated.get());
            System.out.println("Список всех созданных файлов: " + allFilesCreated);
        }
    }
}

