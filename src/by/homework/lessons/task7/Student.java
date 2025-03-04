package by.homework.lessons.task7;

    /*
    Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
    faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
    Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
     */

public class Student {

    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageGrade;

    public Student() {
            } //  Конструктор без параметров

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }


    // Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println(id + ". Имя: " + name + " " + surname + ". Факультет: " + faculty + ". Курс: " + course + ". Группа: " + group
                + ". Средняя оценка: " + averageGrade);
    }

    //Создать метод, который будет изменять текущую группу студента
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    // Создать метод, который будет возвращать текущую группу студента
    public String getGroup() {
        return this.group;
    }

    // Создать метод, который будет изменять оценку студента и группу студента
    public void changeGradeAndGroup(int newGrade, String newGroup) {
        this.averageGrade = newGrade;
        this.group = newGroup;
    }

    //Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
    // массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
    // Public Student[]getStudents(Students[]students, int mark)

    public Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students)
            if (student.averageGrade >= mark) {
                count++;
            }
        // Создаем новый массив нужного размера
        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.averageGrade >= mark) {
                result[index] = student;
                index++;
            }
        }

        return result;
    }

}





