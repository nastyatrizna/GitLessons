package by.homework.lessons.task7;

public class Main {
    /*
    Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
    faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
    Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
     */
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(1, "Василий", "Барановский", "АТФ", 4, "101", 5);
        students[1] = new Student(2, "Иван", "Иванович", "ЭФ", 3, "602", 4);
        students[2] = new Student(3, "Александр", "Гайдукевич", "МСФ", 3, "303", 7);
        students[3] = new Student(4, "Ольга", "Литвинович", "АТФ", 1, "103", 8);
        students[4] = new Student(5, "Наталья", "Василькович","ФЭС", 2, "501", 9);

        Student tempStudent = new Student(); // Создаем экземпляр класса Student, чтобы вызвать метод getStudents

        Student[] goodStudents = tempStudent.getStudents(students, 7); // Получаем массив студентов с оценкой выше 7


        System.out.println("Студенты с оценкой выше 7:"); // Вывод информации о студентах из полученного массива
        if (goodStudents.length > 0) {
            for (Student student : goodStudents) {
                student.info();
            }
        } else {
            System.out.println("Нет студентов с оценкой выше 7");
        }


    }

}
