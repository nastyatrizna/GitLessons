package by.homework.lessons.task14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ward {

    private int number;
    private Gender type;
    private Set<Patient> patients;

    public Ward(int number, Gender type) {
        this.number = number;
        this.type = type;
        this.patients = new TreeSet<>();
    }

    public int getNumber() {
        return number;
    }

    public Gender getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(Gender type) {
        this.type = type;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() <= 3) {
            if (patient.getGender() == type) {
                if (patients.isEmpty()) {
                    return patients.add(patient);
                } else {
                    Iterator<Patient> iterator = patients.iterator();
                    Patient firstPatient = iterator.next();
                    if (patient.getDiagnosis().equals(firstPatient.getDiagnosis())) {
                        return patients.add(patient);
                    } else {
                        System.out.println("Пациента №" + patient.getId() + " нельзя добавить - не совпадает диагноз");
                    }
                }
            } else {
                System.out.println("Пациента №" + patient.getId() + " нельзя добавить - не совпадает пол");
            }
        }
        else{
            System.out.println("Пациента нельзя добавить - палата заполнены");
        }
        return false;
    }

    public void showWardPatients() {
        System.out.println("В палате №" + number + " лежат пациенты: ");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}

