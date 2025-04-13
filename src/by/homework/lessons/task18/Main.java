package by.homework.lessons.task18;

public class Main {

    public static void main(String[] args) {
        Auto car1 = new Auto("Opel Omega", "0011 MC-7", 1000);
        Auto car2 = new Auto("BMW 745i", "0663 MM-7", 500);
        carStarts(car1, car2);

        // Запуск трех машин с использованием join
        Auto car3 = new Auto("Geely Coolray", "1444 КМ-7", 750);
        Auto car4 = new Auto("Audi A8", "7887 II-7", 250);
        Auto car5 = new Auto("Lada Granta", "1410 AI-7", 1250);
        carStartsWithJoin(car3, car4, car5);
    }

    private static void carStarts(Auto car1, Auto car2) {
        car1.start();
        car2.start();
    }

    private static void carStartsWithJoin(Auto car3, Auto car4, Auto car5) {
        car3.start();

        try {
            car3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        car4.start();
        car5.start();
    }


}
