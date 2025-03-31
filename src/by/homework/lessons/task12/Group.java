package by.homework.lessons.task12;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudentsByMark(int mark) {
        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            if (student.getAverageMark() < mark) {
                students.remove(i);
            }
        }
    }

    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            newGroup.getStudents().addAll(this.students);
            this.students.clear();
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageMark();
        }
        return sum / students.size();
    }

    @Override
    public String toString() {
        return "Группа: " + groupNumber + ", Студенты: " + students;
    }
}
