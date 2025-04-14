package by.homework.lessons.task17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow. The\n" +
                "old count had money enough that year, as all his estates had been remortgaged,and so Nicholas, acquiring a trotter of his own, very stylish riding breeches\n" +
                "of the latest cut, such as no one else yet had in Moscow, and boots of thelatest fashion, with extremely pointed toes and small silver spurs, passed his\n" +
                "time very gaily. After a short period of adapting himself to the old conditionsof life, Nicholas found it very pleasant to be at home again. He felt that he\n" +
                "had grown up and matured very much. His despair at failing in a Scriptureexamination, his borrowing money from Gavríl to pay a sleigh driver, his\n" +
                "kissing Sónya on the sly—he now recalled all this as childishness he had leftimmeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with\n" +
                "silver, and wearing the Cross of St. George, awarded to soldiers for bravery inaction, and in the company of well-known, elderly, and respected racing men was\n" +
                "training a trotter of his own for a race. He knew a lady on one of theboulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’\n" +
                "ball, talked about the war with Field Marshal Kámenski, visited the EnglishClub, and was on intimate terms with a colonel of forty to whom Denísov had\n" +
                "introduced him.";

        File relativeFile = new File("text.txt");
        File absoluteFile = new File("C:\\Users\\anastasiya.trizna\\Desktop\\text.txt");

        // 1.1 Запись в файл (относительный путь)
        try {
            writeToFile(text, relativeFile);
            System.out.println("Текст записан в файл (относительный путь): " + relativeFile.getPath());
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл (относительный путь): " + e.getMessage());
        }

        // 1.2 Запись в файл (абсолютный путь)
        try {
            writeToFile(text, absoluteFile);
            System.out.println("Текст записан в файл (абсолютный путь): " + absoluteFile.getPath());
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл (абсолютный путь): " + e.getMessage());
        }

        // 1.3 Чтение из файла (относительный путь)
        try {
            String textFromFileRelative = readFromFile(relativeFile);
            System.out.println("Текст прочитан из файла (относительный путь):\n" + textFromFileRelative);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла (относительный путь): " + e.getMessage());
        }

        // 1.4 Чтение из файла (абсолютный путь)
        try {
            String textFromFileAbsolute = readFromFile(absoluteFile);
            System.out.println("Текст прочитан из файла (абсолютный путь):\n" + textFromFileAbsolute);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла (абсолютный путь): " + e.getMessage());
        }

        // 2.1 Создание объекта Автомобиль и сериализация
        try {
            Auto car = new Auto("Toyota", "Japan", 320);
            serialize(car, "car.txt");
            System.out.println("Автомобиль сериализован в файл car.txt");
        } catch (IOException e) {
            System.err.println("Ошибка сериализации: " + e.getMessage());
        }

        // 2.2 Десериализация автомобиля и вывод в консоль
        try {
            Auto deserializedCar = (Auto) deserialize("car.txt");
            System.out.println("Автомобиль десериализован:\n" + deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка десериализации: " + e.getMessage());
        }
    }

    // Методы для работы с файлами
    public static void writeToFile(String text, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(text);
        }
    }

    public static String readFromFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }

    // Cериализация/десериализациия методы
    public static void serialize(Object obj, String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
        }
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        }
    }
}
