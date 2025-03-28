package by.homework.lessons.task11;

public class RobotSapper implements RobotEngineer {
    /*
    РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
    В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
     */

    private String model;
    private int powerConsumption;
    private String deminingChassisNumber;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int powerConsumption, String deminingChassisNumber, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.deminingChassisNumber = deminingChassisNumber;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public String repairRobot() {
        return "РоботСапер " + model + " ремонтируется специализированным оборудованием.";
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("РоботСапер " + model + " включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("РоботСапер " + model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботСапер " + model + " разминирует заданные участки.");
    }

    @Override
    public void createItem() {
        System.out.println("РоботСапер " + model + " создает приспособление для разминирования, используя " + material + ".");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getModel() {
        return model;
    }
}
