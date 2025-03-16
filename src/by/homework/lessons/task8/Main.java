package by.homework.lessons.task8;

public class Main {
    /*
1.1.Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.
2.1.В этом методе необходимо выполнить следующую логику. Если строка в 1-ом параметре заканчивается строкой из второго параметра,
то необходимо вырезать из строки 1-ого параметра значение строки не включающей строку из второго параметра.
Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
Пример:
Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой
что и 2-ая строка (java), то метод должен вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ JAVA».
В этом методе нужно использовать методы для работы со
строками: endWith(), indexOf(), substring(), toUpperCase();
3.1 В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат в консоль.
     */

    public static String chekingStrings(String firstString, String secondString) {
        if (firstString.endsWith(secondString)) {
            int index = firstString.indexOf(secondString);
            if (index > 0) {
                return firstString.substring(0, index).trim();
            } else {
                return "_"; // если вторая начинается с начала первой строки, возвращаем пустую строку (чтобы было видно в консоли, что пустая - поставила нижнее подчёркивание)
            }

        } else {
            return firstString.toUpperCase(); // иначе возвращаем строку в верхнем регистре
        }
    }

    public static void main(String[] args) {
        String firstString1 = "I love java";
        String secondString1 = "java";
        String result1 = chekingStrings(firstString1, secondString1);
        System.out.println(result1);


        String firstString2 = "I love java";
        String secondString2 = "python";
        String result2 = chekingStrings(firstString2, secondString2);
        System.out.println(result2);


        String firstString3 = "java";
        String secondString3 = "java";
        String result3 = chekingStrings(firstString3, secondString3);
        System.out.println(result3);
    }
}
