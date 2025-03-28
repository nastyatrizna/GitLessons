package by.homework.lessons.task11;

public interface Robot {
    /*
    Создать интерфейс Робот.
    В нём определены методы: Дефолтный метод:  Отремонтировать робота
    и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
     */

    default String repairRobot() {
        return "Робот ремонтируется (стандартный способ).";
    }

    void turnOn();

    void turnOff();

    void uniquePossibility();
}
