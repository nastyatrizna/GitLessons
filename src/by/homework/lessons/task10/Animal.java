package by.homework.lessons.task10;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                maxLifeLong == animal.maxLifeLong &&
                Objects.equals(color, animal.color) &&
                Objects.equals(foodType, animal.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, maxLifeLong, foodType);
    }
}
