package by.homework.lessons.task6;

public class LastArray {
    public static void main(String[] args) {
        /*
        Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив.
        Выполнить с помощью цикла for
         */

        int[] array = {5, 2, 8, 4, 9, 4, 7, 3, 25};

        System.out.println("Заданный массив:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int element = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = element;
                }
            }
        }

        System.out.println("Полученный массив:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
