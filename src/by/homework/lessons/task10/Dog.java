package by.homework.lessons.task10;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maxLifeLong, String foodType, String name, String breed, double averageWeight) {
        super(color, maxLifeLong, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void bark() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук: Гав!");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    @Override
    public String toString() {
        return "Собака " + getId() +
                ", имя: '" + name + '\'' +
                ", порода: '" + breed + '\'' +
                ", средний вес: " + averageWeight +
                ", цвет: '" + getColor() + '\'' +
                ", максимальная продолжительность жизни: " + getMaxLifeLong() +
                ", тип еды: " + getFoodType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Сравниваем поля родительского класса
        Dog dog = (Dog) o;
        return Double.compare(dog.averageWeight, averageWeight) == 0 &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, breed, averageWeight); // Включаем hashCode родительского класса
    }
}
