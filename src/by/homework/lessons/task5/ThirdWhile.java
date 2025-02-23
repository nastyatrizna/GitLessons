package by.homework.lessons.task5;

import java.util.Scanner;

public class ThirdWhile {
    public static void main(String[] args) {
        // Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = in.nextInt();


        if (a % 10 == 0) {
            System.out.println("Вы ввели число, которое заканчивается на 0 :(");
        } else {
            int b = 0;

            while (a != 0) {
                int aLastNumber = a % 10;
                b = b * 10 + aLastNumber;
                a = a / 10;
            }

            System.out.println("Введенное число в обратном порядке " + b);
        }


    }
}
