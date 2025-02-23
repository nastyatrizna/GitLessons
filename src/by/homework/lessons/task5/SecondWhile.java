package by.homework.lessons.task5;

import java.util.Scanner;

public class SecondWhile {
    public static void main(String[] args) {
        // Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое положительное число");
        int a = in.nextInt();
        System.out.println("Введите второе положительное число");
        int b = in.nextInt();

        int sum = 0;

        if (a == b) {
            System.out.println("Числа равны друг другу, может умножим их на 2 или попробуем еще раз? :)");
        } else if (a < b) {
            int first = a;
            int last = b;
            int current = first;

            while (current <= last) {
                sum += current;
                current++;
            }
            System.out.println("Сумма чисел от " + first + " до " + last + " равна " + sum);
        } else {
            int first = b;
            int last = a;
            int current = first;

            while (current <= last) {
                sum += current;
                current++;
            }
            System.out.println("Сумма чисел от " + first + " до " + last + " равна " + sum);
        }

        }

    }

