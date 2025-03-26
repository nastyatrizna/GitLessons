package by.homework.lessons.task9;

public class Main {
    public static void main(String[] args) {
        // Создаём объекты
        Dog dog1 = new Dog("Коричневый", 12, "Мясо", "Рекс", "Овчарка", 25.5);
        Dog dog2 = new Dog("Белый", 10, "Мясо", "Лаки", "Хаски", 22.0);
        Dog dog3 = new Dog("Черный", 15, "Мясо", "Валет", "Лайка", 18.7);

        Bird bird1 = new Bird("Синий", 8, "Насекомые", "Воробей", 150);
        Bird bird2 = new Bird("Желтый", 5, "Насекомые", "Канарейка", 100);
        Bird bird3 = new Bird("Красный", 7, "Насекомые", "Попугай", 80);

        // Демонстрация поведения
        dog1.bark();
        dog2.play();
        bird1.sing();
        bird2.peck();

        // toString
        System.out.println(dog1);
        System.out.println(bird1);

        // Создаём зоопарк
        Zoo zoo = new Zoo();

        // Добавляем животных
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        // Вызовываем метод
        Animal[] zooAnimals = zoo.getAnimals();
        for (Animal animal : zooAnimals) {
            animal.makeSound();
            animal.play();
        }

        // Создаём львов
        Lion lion1 = new Lion("Золотистый", 15, "Мясо", "Темно-коричневая");
        Lion lion2 = new Lion("Светло-коричневый", 12, "Мясо", "Коричневая");
        Lion lion3 = new Lion("Золотистый", 14, "Мясо", "Черная");

        lion1.makeSound();
        lion1.play();

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println("\nВсе животные в зоопарке:");
        zooAnimals = zoo.getAnimals();
        for (Animal animal : zooAnimals) {
            animal.makeSound();
            animal.play();
        }

        // Удаляем животных
        System.out.println("\nИнформация о всех животных в зоопарке:");
        zoo.displayAllAnimalInfo();

        System.out.println("\nУдаление животного с id 2:");
        zoo.removeAnimal(2);

        System.out.println("\nИнформация о всех животных в зоопарке после удаления:");
        zoo.displayAllAnimalInfo();
    }
}