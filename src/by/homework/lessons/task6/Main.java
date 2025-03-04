package by.homework.lessons.task6;

public class Main {
    public static void main(String[] args) {
        // Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль(выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each.

        int[] array = new int[10];
        array[0] = 1;
        array[1] = 7;
        array[2] = 8;
        array[3] = 2;
        array[4] = 2;
        array[5] = 4;
        array[6] = 7;
        array[7] = 9;
        array[8] = 13;
        array[9] = 2;

       System.out.println("Заданный массив:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println("Полученный массив:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
