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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;  // Сначала сравниваем поля Animal

        if (getClass() != obj.getClass())
            return false;

        Dog other = (Dog) obj;

        if (Double.doubleToLongBits(averageWeight) != Double.doubleToLongBits(other.averageWeight)) return false;  // для double

        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;

        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        int result = super.hashCode(); // Начинаем с hashCode родительского класса
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (breed == null ? 0 : breed.hashCode());
        long temp = Double.doubleToLongBits(averageWeight);  // Для double
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
