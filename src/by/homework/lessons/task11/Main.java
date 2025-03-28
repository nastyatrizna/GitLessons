package by.homework.lessons.task11;

public class Main {
    /*
    В классе Main создайте по экземпляру объекта (РоботСапёр, РоботСтроитель,РоботПовар) и вызовите метод отремонтировать робота (результаты
методы выведите в консоль)
     */

    public static void main(String[] args) {
        RobotSapper sapper = new RobotSapper("RS-100", 1100, "Chassis-001", "Сталь AISI304");
        RobotBuilder builder = new RobotBuilder("RB-200", 1200, "Japan", "Сement mixer", "цемент");
        RobotCooker cooker = new RobotCooker("RC-300", 1300, "Italy", "Grill");

        // Вызов метода "отремонтировать робота" и вывод результатов
        System.out.println(sapper.repairRobot());
        System.out.println(builder.repairRobot());
        System.out.println(cooker.repairRobot());

        // Метод включения и выключения робота должен менять поле в каждом роботе boolean isOn
        sapper.turnOn();
        sapper.turnOff();
        builder.turnOn();
        builder.turnOff();
        cooker.turnOn();
        cooker.turnOff();

        // Метод uniquePossibility
        sapper.uniquePossibility();
        builder.uniquePossibility();
        cooker.uniquePossibility();

        // Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды
        // роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров
        Robot[] allRobots = {sapper, builder, cooker};
        RobotEngineer[] engineerRobots = {sapper, builder};
        RobotSapper[] sapperRobots = {sapper};

        // Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
        System.out.println("\nВыставка всех роботов:");
        for (Robot robot : allRobots) {
            robot.uniquePossibility();
        }

        System.out.println("\nВыставка роботов-инженеров:");
        for (Robot robot : engineerRobots) {
            robot.uniquePossibility();
        }

        System.out.println("\nВыставка роботов-саперов:");
        for (Robot robot : sapperRobots) {
            robot.uniquePossibility();
        }

        // Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке
        System.out.println("\nДемонстрация createItem на выставке роботов-инженеров:");
        for (RobotEngineer robot : engineerRobots) {
            robot.createItem();
        }
    }

}
