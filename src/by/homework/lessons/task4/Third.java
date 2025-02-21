package by.homework.lessons.task4;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        /*
        Дано 15/x=result, где x-число, которое вводится с
командной строки, result-результат вычисления. Написать программу, которая будет выводит разный текст,
в зависимости от значения result. В случае result=3, вывести: "Результат деления равен 3"
В случае result=5вывести: "Результат деления равен 5" В других случаях вывести:
"Результат деления равен дробному числу".
При этом в последнем случае вывести точный результат деления (использовать приведение типов)
        */

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextInt();
        double result = 15.0 / x;

        if (x == 4) {
            System.out.println("Результат деления равен дробному числу");
            System.out.println("Результат деления: " + result);
        }
            else {
        switch ((int) result) {
            case 1:
                System.out.println("Результат деления 15 на 15 равен 1");
            case 15:
                System.out.println("Деление на единицу равно делимому, в нашем случае: 15");
                break;
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу");
                System.out.println("Точный результат деления: " + result);
        }
        }

    }

}
