package by.homework.lessons.task18.runnable;

public class Main {

    public static void main(String[] args) {
        Auto car1 = new Auto("Opel Omega", "0011 MC-7", 1000);
        Auto car2 = new Auto("BMW 745i", "0663 MM-7", 500);
        carStarts(car1, car2);
    }

    private static void carStarts(Auto car1, Auto car2) {
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        thread1.start();
        thread2.start();
    }
}
