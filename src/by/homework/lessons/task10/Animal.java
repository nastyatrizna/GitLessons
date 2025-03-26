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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Animal other = (Animal) obj;

        if (id != other.id)
            return false;
        if (maxLifeLong != other.maxLifeLong)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;

        if (foodType == null) {
            if (other.foodType != null)
                return false;
        } else if (!foodType.equals(other.foodType))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        int result = 17; // Простое начальное значение
        result = 31 * result + id; // Используем простое число (31) для умножения
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + maxLifeLong;
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        return result;
    }
}
