package by.homework.lessons.task18.runnable;

public class Auto implements Runnable {

    private String name;
    private String licensePlate;
    private int stopTime;

    public Auto(String name, String licensePlate, int stopTime) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.stopTime = stopTime;
    }

    public void carMoving () {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " г/н " + licensePlate + " едет...");
        }
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " г/н " + licensePlate + " поехала");
            carMoving();
            Thread.sleep(stopTime); // поставила его сюда, так как логично, чтобы машина останавливалась уже после цикла, а не каждый раз
            System.out.println(name + " г/н " + licensePlate + " остановилась за " + stopTime + " миллисекунд");
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
