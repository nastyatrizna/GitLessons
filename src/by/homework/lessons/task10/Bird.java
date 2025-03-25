package by.homework.lessons.task10;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;

        if (getClass() != obj.getClass())
            return false;

        Bird other = (Bird) obj;

        if (maxFlightAltitude != other.maxFlightAltitude)
            return false;

        if (family == null) {
            if (other.family != null)
                return false;
        } else if (!family.equals(other.family))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (family == null ? 0 : family.hashCode());
        result = 31 * result + maxFlightAltitude;
        return result;
    }
}