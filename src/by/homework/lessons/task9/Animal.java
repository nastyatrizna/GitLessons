package by.homework.lessons.task9;

public class Animal {
    private int id;
    private String color;
    private int maxLifeLong;
    private String foodType;

    private static int nextId = 1;

    public Animal(String color, int maxLifeLong, String foodType) {
        this.id = nextId++;
        this.color = color;
        this.maxLifeLong = maxLifeLong;
        this.foodType = foodType;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getMaxLifeLong() {
        return maxLifeLong;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "Животное " + id +
                ", цвет: '" + color + '\'' +
                ", максимальная продолжительность жизни: " + maxLifeLong +
                ", тип еды: " + foodType;
    }
}
