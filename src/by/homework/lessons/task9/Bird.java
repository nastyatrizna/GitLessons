package by.homework.lessons.task9;

public class Bird extends Animal {
    private String family;
    private int maxFlightAltitude;

    public Bird(String color, int maxLifeLong, String foodType, String family, int maxFlightAltitude) {
        super(color, maxLifeLong, foodType);
        this.family = family;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public void sing() {
        System.out.println(family + " поёт");
    }

    public void peck() {
        System.out.println(family + " клюёт");
    }

    public void incubateEggs() {
        System.out.println(family + " высиживает птенцов");
    }

    @Override
    public void makeSound() {
        System.out.println(family + " издает звук: Чирик!");
    }

    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    public String getFamily() {
        return family;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    @Override
    public String toString() {
        return "Птица " + getId() +
                ", семейство: '" + family + '\'' +
                ", максимальная высота полёта: " + maxFlightAltitude +
                ", цвет: '" + getColor() + '\'' +
                ", максимальная продолжительность жизни: " + getMaxLifeLong() +
                ", тип еды: " + getFoodType();
    }
}
