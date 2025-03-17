package by.homework.lessons.task6;

public class ThirdArray {
    public static void main(String[] args) {
        /*
        Создать массив вручную. Заменить максимальный и минимальный элемент массива.
        Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        */

        int[] array = {5, 2, 8, 4, 9, 4, 7, 3, 25};

        System.out.println("Заданный массив:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        array[minIndex] = -1000;
        array[maxIndex] = 1000;

        System.out.println("Полученный массив:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


