package by.homework.lessons.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {

    private String departmentName;
    private Set<Ward> wards;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.wards = new HashSet<>();
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    public void addWard(Ward ward) {
        this.wards.add(ward);
    }

    public int countMales() {
        int count = 0;
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Gender.MALE) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countFemales() {
        int count = 0;
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Gender.FEMALE) {
                    count++;
                }
            }
        }
        return count;
    }
}
