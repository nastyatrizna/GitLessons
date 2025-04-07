package by.homework.lessons.task14;

import java.util.Objects;

public class Patient implements Comparable<Patient> {

    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String name, String surname, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + ". ФИ: " + surname + " " + name + ", диагноз: " + diagnosis + ", возраст: " + age + ", пол: " + gender ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(diagnosis, patient.diagnosis) && gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, diagnosis, age, gender);
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.id, other.id);
    }

}
