package by.homework.lessons.task11;

public class RobotCooker implements Robot {
    /*
    РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
     */

    private String model;
    private int powerConsumption;
    private String countryOfOrigin;
    private String cookingApparatus;
    private boolean isOn;

    public RobotCooker(String model, int powerConsumption, String countryOfOrigin, String cookingApparatus) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfOrigin = countryOfOrigin;
        this.cookingApparatus = cookingApparatus;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("РоботПовар " + model + " включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("РоботПовар " + model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботПовар " + model + " готовит с помощью " + cookingApparatus + ".");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getModel() {
        return model;
    }
}
