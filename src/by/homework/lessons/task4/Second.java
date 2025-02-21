package by.homework.lessons.task4;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();

        if (a % 2 == 0 && a % 5 == 0) {
            System.out.println("Число " + a + " делится на 2 и на 5");
        }

        if (b % 2 == 0 && b % 5 == 0) {
            System.out.println("Число " + b + " делится на 2 и на 5");
        }
        if (c % 2 == 0 && c % 5 == 0) {
            System.out.println("Число " + c + " делится на 2 и на 5");
        }

    }
}
