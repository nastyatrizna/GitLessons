package by.homework.lessons.task13;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi A7", 90);
        Motorcycle motorcycle = new Motorcycle("Honda CBR 600", 125);

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        // Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж

        System.out.println("Транспорт в гараже для автомобилей: " + carGarage.getVehicle().getName());
        System.out.println("Въезд в гараж для автомобилей разрешен: " + carGarage.isEntryPermitted());

        System.out.println("Транспорт в гараже для мотоциклов: " + motorcycleGarage.getVehicle().getName());
        System.out.println("Въезд в гараж для мотоциклов разрешен: " + motorcycleGarage.isEntryPermitted());
    }

}
