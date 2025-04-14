package by.homework.lessons.task17;

import java.io.Serializable;
import java.util.Objects;

public class Auto implements Serializable {

    private String brand;
    private int maxSpeed;
    private String country;

    public Auto(String brand, String country, int maxSpeed) {
        this.brand = brand;
        this.country = country;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return maxSpeed == auto.maxSpeed && Objects.equals(brand, auto.brand) && Objects.equals(country, auto.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, country);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }
}
