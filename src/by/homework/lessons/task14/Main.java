package by.homework.lessons.task14;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "Адам", "Адамович", "Инфаркт", 35, Gender.MALE);
        Patient patient2 = new Patient(2, "Борис", "Барташевич", "Аппендицит", 27, Gender.MALE);
        Patient patient3 = new Patient(3, "Владимир", "Войтехович", "ОРВИ", 52, Gender.MALE);
        Patient patient4 = new Patient(4, "Геннадий", "Гайдукевич", "ОРВИ", 23, Gender.MALE);
        Patient patient5 = new Patient(5, "Дмитрий", "Демидович", "Инфаркт", 76, Gender.MALE);
        Patient patient6 = new Patient(6, "Елена", "Ермолович", "Аппендицит", 28, Gender.FEMALE);
        Patient patient7 = new Patient(7, "Жизель", "Жинко", "ОРВИ", 42, Gender.FEMALE);
        Patient patient8 = new Patient(8, "Зинаида", "Зеленевич", "ОРВИ", 37, Gender.FEMALE);
        Patient patient9 = new Patient(9, "Игорь", "Ильев", "Инфаркт", 67, Gender.MALE);
        Patient patient10 = new Patient(1, "Адам", "Адамович", "Инфаркт", 35, Gender.MALE);

        Ward ward1 = new Ward(1, Gender.FEMALE);
        Ward ward2 = new Ward(2, Gender.MALE);

        ward2.addPatient(patient1);
        ward2.addPatient(patient2);
        ward2.addPatient(patient7);
        ward2.addPatient(patient3);
        ward2.addPatient(patient4);
        ward2.addPatient(patient5);
        ward2.addPatient(patient9);
        ward2.addPatient(patient10);


        ward1.addPatient(patient6);
        ward1.addPatient(patient7);
        ward1.addPatient(patient8);



        Department department = new Department("Терапия");

        department.addWard(ward1);
        department.addWard(ward2);


        System.out.println("Количество мужчин в отделении: " + department.countMales());
        System.out.println("Количество женщин в отделении: " + department.countFemales());


        ward1.showWardPatients();
        ward2.showWardPatients();
    }

}
