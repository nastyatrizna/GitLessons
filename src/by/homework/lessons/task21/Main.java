package by.homework.lessons.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // 1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        String formattedDate1 = getCurrentDateFormatted1();
        System.out.println("1. Текущая дата: " + formattedDate1);

        // 2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM).
        String formattedDate2 = getCurrentDateFormatted2();
        System.out.println("2. Текущая дата: " + formattedDate2);

        // 3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию.
        LocalDateTime dateTime3 = parseStringDate3("2023-03-19 : 10:12:24 AM");
        System.out.println("3. LocalDateTime: " + dateTime3);

        // 4. Перевести String (пн 20.03.23 г. время: 15:07:28) в формат LocalDateTime по умолчанию.
        LocalDateTime dateTime4 = parseStringDate4("пн 20.03.23 г. время: 15:07:28");
        System.out.println("4. LocalDateTime: " + dateTime4);

        // 5. Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM).
        String formattedDate5 = getCurrentDateFormatted5();
        System.out.println("5. Текущая дата: " + formattedDate5);

    }

        // 1. Вывести текущую дату в формате (пример формата: 1 апреля 2023).
        public static String getCurrentDateFormatted1() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        return now.format(formatter);
    }

        // 2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM).
        public static String getCurrentDateFormatted2() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        return now.format(formatter);
    }

        // 3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию.
        public static LocalDateTime parseStringDate3(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.US);
        return LocalDateTime.parse(dateString, formatter);
    }

        // 4. Перевести String (пн 20.03.23 г. время: 15:07:28) в формат LocalDateTime по умолчанию.
        public static LocalDateTime parseStringDate4(String dateString) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("E dd.MM.yy 'г. время:' HH:mm:ss").parseDefaulting(ChronoField.YEAR, 2023).toFormatter(new Locale("ru"));
        return LocalDateTime.parse(dateString.trim(), formatter);
    }


        // 5. Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM).
        public static String getCurrentDateFormatted5() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("EEEE dd MMMM yyyy 'время:' hh.mm.ss a").toFormatter(new Locale("ru"));
        return now.format(formatter);
    }

}
