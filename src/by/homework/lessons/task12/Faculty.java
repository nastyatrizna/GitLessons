package by.homework.lessons.task12;

import java.util.ArrayList;
import java.util.List;

public class Faculty {


    private String facultyName;
    private List<Group> groups;
    private FacultyStatus status;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    public void updateStatus() {
        int totalStudents = 0;
        for (Group group : groups) {
            totalStudents += group.getStudents().size();
        }

        if (totalStudents < 20) {
            this.status = FacultyStatus.NOT_ACTIVE;
        } else {
            this.status = FacultyStatus.ACTIVE;
        }

    }

    @Override
    public String toString() {
        return "Факультет: " + facultyName + ", Группы: " + groups +
                ", Статус факультета: " + status;
    }
}
