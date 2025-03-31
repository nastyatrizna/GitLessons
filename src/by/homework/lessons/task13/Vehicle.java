package by.homework.lessons.task13;

public class Vehicle {

    private String name;
    private Integer emissionsAmount;

    public Vehicle(String name, Integer emissionsAmount) {
        this.name = name;
        this.emissionsAmount = emissionsAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmissionsAmount() {
        return emissionsAmount;
    }

    public void setEmissionsAmount(Integer emissionsAmount) {
        this.emissionsAmount = emissionsAmount;
    }


}

