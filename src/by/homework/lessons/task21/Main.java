package by.homework.lessons.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // 1. ������� ������� ���� � ������� (������ �������: 1 ������ 2023). �� ������ ���� ������ ���� ������ String
        String formattedDate1 = getCurrentDateFormatted1();
        System.out.println("1. ������� ����: " + formattedDate1);

        // 2. ������� ������� ���� � ������� (������ �������: 1 ������ 2023, 10:59:20 PM).
        String formattedDate2 = getCurrentDateFormatted2();
        System.out.println("2. ������� ����: " + formattedDate2);

        // 3. ��������� String (2023-03-19 : 10:12:24 AM) � ������ LocalDateTime �� ���������.
        LocalDateTime dateTime3 = parseStringDate3("2023-03-19 : 10:12:24 AM");
        System.out.println("3. LocalDateTime: " + dateTime3);

        // 4. ��������� String (�� 20.03.23 �. �����: 15:07:28) � ������ LocalDateTime �� ���������.
        LocalDateTime dateTime4 = parseStringDate4("�� 20.03.23 �. �����: 15:07:28");
        System.out.println("4. LocalDateTime: " + dateTime4);

        // 5. ������� ������� ���� � ������� (������ �������: ����������� 20 ����� 2023 �����: 11.54.06 PM).
        String formattedDate5 = getCurrentDateFormatted5();
        System.out.println("5. ������� ����: " + formattedDate5);

    }

        // 1. ������� ������� ���� � ������� (������ �������: 1 ������ 2023).
        public static String getCurrentDateFormatted1() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        return now.format(formatter);
    }

        // 2. ������� ������� ���� � ������� (������ �������: 1 ������ 2023, 10:59:20 PM).
        public static String getCurrentDateFormatted2() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        return now.format(formatter);
    }

        // 3. ��������� String (2023-03-19 : 10:12:24 AM) � ������ LocalDateTime �� ���������.
        public static LocalDateTime parseStringDate3(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.US);
        return LocalDateTime.parse(dateString, formatter);
    }

        // 4. ��������� String (�� 20.03.23 �. �����: 15:07:28) � ������ LocalDateTime �� ���������.
        public static LocalDateTime parseStringDate4(String dateString) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("E dd.MM.yy '�. �����:' HH:mm:ss").parseDefaulting(ChronoField.YEAR, 2023).toFormatter(new Locale("ru"));
        return LocalDateTime.parse(dateString.trim(), formatter);
    }


        // 5. ������� ������� ���� � ������� (������ �������: ����������� 20 ����� 2023 �����: 11.54.06 PM).
        public static String getCurrentDateFormatted5() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("EEEE dd MMMM yyyy '�����:' hh.mm.ss a").toFormatter(new Locale("ru"));
        return now.format(formatter);
    }

}
