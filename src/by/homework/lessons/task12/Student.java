package by.homework.lessons.task12;

import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private Date birthDate;
    private String birthCity;
    private double averageMark;

    public Student (String name, String surname, Date birthDate, String birthCity, double averageMark) {
        this.name = name;
        this.surname = surname;
        this. birthDate = birthDate;
        this.birthCity = birthCity;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + surname + ", Дата рождения: " + birthDate +
                ", Место рождения: " + birthCity + ", Средний балл " + averageMark;
    }

}
