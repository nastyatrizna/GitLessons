package by.homework.lessons.task8;

public class Second {
    /*
2. Дан текст: "Каждая строка ... ссылку."
2.1 Написать метод который будет применять индекс (int k) и подстроку (String str). Метод должен возвращать тип String
2.2 В тексте после символа каждого слова с индексом k вставить заданную подстроку.
Используемые методы (split(), substring())
     */

    public static String insertStringAfterEachKthCharacter(String text, int k, String str) {
        String[] words = text.split("\\s+"); // pазделяем текст на слова, отделеённые пробелами
        StringBuilder newText = new StringBuilder();

        for (String word : words) {
            if (word.length() > k) {
                String beforeK = word.substring(0, k + 1); // берём часть слова до (k+1)-го символа
                String afterK = word.substring(k + 1);   // берём часть слова после (k+1)-го символа
                newText.append(beforeK).append(str).append(afterK).append(" "); // делаем новое измененное слово
            } else {
                newText.append(word).append(" "); // если слово короче чем k, оставляем его без изменений
            }
        }

        return newText.toString().trim();
    }

    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 3; // то есть будет вставка после каждого 4го элемента, т.к. массив с [0]
        String str = "ALERT!";
        String newText = insertStringAfterEachKthCharacter(text, k, str);
        System.out.println(newText);
    }
}
