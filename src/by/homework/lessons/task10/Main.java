package by.homework.lessons.task10;

public class Main {
    public static void main(String[] args) {
        // Создаём объекты
        Dog dog1 = new Dog("Коричневый", 12, "Мясо", "Рекс", "Овчарка", 25.5);
        Dog dog2 = new Dog("Белый", 10, "Мясо", "Лаки", "Хаски", 22.0);
        Dog dog3 = new Dog("Черный", 15, "Мясо", "Валет", "Лайка", 18.7);

        Bird bird1 = new Bird("Синий", 8, "Насекомые", "Воробей", 150);
        Bird bird2 = new Bird("Желтый", 5, "Насекомые", "Канарейка", 100);
        Bird bird3 = new Bird("Красный", 7, "Насекомые", "Попугай", 80);

        // Демонстрация equals и hashCode
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
        System.out.println("dog1.hashCode(): " + dog1.hashCode());
        System.out.println("dog2.hashCode(): " + dog2.hashCode());

        System.out.println("bird1.equals(bird2): " + bird1.equals(bird2));
        System.out.println("bird1.hashCode(): " + bird1.hashCode());
        System.out.println("bird2.hashCode(): " + bird2.hashCode());
    }
}