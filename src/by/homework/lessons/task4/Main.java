package by.homework.lessons.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // На вход даны 3 числа. Вывести в консоль только чётные числа
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(a + ", " + b + ", " + c + " - чётные числа");
        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(b + ", " + c + " - чётные числа");
        } else if (a % 2 == 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println(a + ", " + c + " - чётные числа");
        } else if (a % 2 == 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println(a + ", " + b + " - чётные числа");
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println("Только " + c + " - чётное число");
        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println("Только " + b + " - чётное число");
        } else if (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println("Только " + a + " - чётное число");
        } else {
            System.out.println("Чётные числа отсутвуют");
        }

    }
}
