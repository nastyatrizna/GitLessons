package by.homework.lessons.task6;

public class SecondArray {
    public static void main(String[] args) {
       /*
        Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
        Необходимо скопировать первый массив со всеми значениями во второй массив.
        Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
       */

        int[] firstArray = new int[5];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        System.out.println("Заданный массив:");
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] secondArray = new int[firstArray.length + 1];

        for(int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        secondArray[secondArray.length - 1] = 0;

        System.out.println("Полученный массив:");
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}




