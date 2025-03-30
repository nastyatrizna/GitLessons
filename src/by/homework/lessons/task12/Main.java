package by.homework.lessons.task12;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1.1. Создать несколько студентов
        Student student1 = new Student("Адам", "Адамович", new Date(), "Минск", 7.5);
        Student student2 = new Student("Борис", "Барташевич", new Date(), "Могилев", 5.4);
        Student student3 = new Student("Владимир", "Войтехович", new Date(), "Витебск", 9.0);
        Student student4 = new Student("Геннадий", "Гайдукевич", new Date(), "Гродно", 4.7);
        Student student5 = new Student("Дмитрий", "Демидович", new Date(), "Гомель", 8.4);
        Student student6 = new Student("Елена", "Ермолович", new Date(), "Брест", 7.0);
        Student student7 = new Student("Жизель", "Жинко", new Date(), "Новогрудок", 5.2);
        Student student8 = new Student("Зинаида", "Зеленевич", new Date(), "Туров", 8.2);
        Student student9 = new Student("Игорь", "Ильев", new Date(), "Калинковичи", 4.2);


        // 1.2. Создать несколько групп. По этим группам распределить студентов
        Group group1 = new Group("101810");
        Group group2 = new Group("101530");
        Group group3 = new Group("101220");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student6);
        group3.addStudent(student7);
        group3.addStudent(student8);
        group3.addStudent(student9);

        // 1.3. Создать Факультет. Распределить туда группы
        Faculty faculty = new Faculty("АТФ");

        faculty.addGroup(group1);
        faculty.addGroup(group2);
        faculty.addGroup(group3);

        // 1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех,
        // у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
        //Сигнатура метода: public void removeStudentsByMark(int mark);
        group1.removeStudentsByMark(5);
        group2.removeStudentsByMark(5);
        group3.removeStudentsByMark(5);

        // 1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура
        //метода: public void transferToGroup(Group newGroup);
        group3.transferToGroup(group1);
        group2.transferToGroup(group1);
        group1.transferToGroup(group3);

        // 1.6. Реализовать метод в классе Group, который считает средний бал по группе
        System.out.println("Средний балл группы 101810: " + group1.calculateAverageMark());
        System.out.println("Средний балл группы 101530: " + group2.calculateAverageMark());
        System.out.println("Средний балл группы 101220: " + group3.calculateAverageMark());

        // 1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным.
        //(Метод size() в коллекции)
        faculty.updateStatus();
        System.out.println(faculty);

        // Добавляем еще студентов, чтобы факультет был активным
        Student student10 = new Student("Катерина", "Коткова", new Date(), "Минск", 8.5);
        Student student11 = new Student("Людмила", "Литвинович", new Date(), "Лепель", 7.4);
        Student student12 = new Student("Мария", "Мартинович", new Date(), "Витебск", 3.5);
        Student student13 = new Student("Наталья", "Николенко", new Date(), "Новополоцк", 4.9);
        Student student14 = new Student("Олег", "Ольгердович", new Date(), "Белыничи", 8.2);
        Student student15 = new Student("Петр", "Панкратов", new Date(), "Полоцк", 7.7);
        Student student16 = new Student("Рита", "Римченко", new Date(), "Брест", 6.2);
        Student student17 = new Student("Станислав", "Стеневич", new Date(), "Слоним", 8.4);
        Student student18 = new Student("Тимофей", "Таугер", new Date(), "Туров", 4.7);
        Student student19 = new Student("Умут", "Умченко", new Date(), "Новогрудок", 5.5);
        Student student20 = new Student("Федор", "Федорченко", new Date(), "Борисов", 8.1);
        Student student21 = new Student("Христина", "Хилько", new Date(), "Жодино", 9.2);
        Student student22 = new Student("Цветелина", "Цвирко", new Date(), "Жлобин", 8.1);
        Student student23 = new Student("Чен", "Чин", new Date(), "Пекин", 9.2);
        Student student24 = new Student("Шек", "Шевцов", new Date(), "Борисов", 8.1);
        Student student25 = new Student("Эдуард", "Эникович", new Date(), "Жодино", 9.2);

        group1.addStudent(student10);
        group1.addStudent(student11);
        group1.addStudent(student12);
        group2.addStudent(student13);
        group2.addStudent(student14);
        group2.addStudent(student15);
        group3.addStudent(student16);
        group3.addStudent(student17);
        group3.addStudent(student18);
        group3.addStudent(student19);
        group3.addStudent(student20);
        group3.addStudent(student21);
        group3.addStudent(student22);
        group3.addStudent(student23);
        group3.addStudent(student24);
        group3.addStudent(student25);

        faculty.updateStatus();
        System.out.println("После добавления студентов: "+ faculty);


    }
}
