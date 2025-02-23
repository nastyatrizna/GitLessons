package by.homework.lessons.task5;

import java.util.Scanner;

public class FourthWhile {
    public static void main(String[] args) {
        // Ввести число с консоли, которое не заканчивается на 0. Вывести чётные и нечётные числа через while and if.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = in.nextInt();

        if (a % 10 == 0) {
            System.out.println("Вы ввели число, которое заканчивается на 0 :(");
        } else {
            while (a != 0) {
                int aLastNumber = a % 10;

                if (aLastNumber == 0) {
                    System.out.println("Цифра 0 чётная");
                /*
                Если запускать через дебагер, то отрабатывает нормально с числом с нулями, а если через Run, то падает по ошибке:
                Exception in thread "main" java.util.InputMismatchException: For input string: "45674980123"Exception in thread "main" java.util.
                InputMismatchException: For input string: "45674980123"
                 */
                } else if (aLastNumber % 2 == 0) {
                    System.out.println("Цифра " + aLastNumber + " чётная");
                } else {
                    System.out.println("Цифра " + aLastNumber + " нечётная");
                }

                a /= 10;
            }


        }
    }
}
