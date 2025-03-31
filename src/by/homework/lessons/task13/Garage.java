package by.homework.lessons.task13;

public class Garage <T extends Vehicle>{

    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    // Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства.
    // (Boolean isEntryPermitted());
    // Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.

    public boolean isEntryPermitted() {
        return vehicle.getEmissionsAmount() <= 100;
    }

    public T getVehicle() {
        return vehicle;
    }

}
