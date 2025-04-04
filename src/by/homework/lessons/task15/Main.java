package by.homework.lessons.task15;

import java.util.*;

public abstract class Main {

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease, String profession) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employee employee = entry.getKey();
                employee.setSalary(employee.getSalary() + amountOfIncrease);
            }
        }
    }

    private static Map<String, List<Employee>> groupByProfession (Map<Employee, String> employees) {
        Map<String, List<Employee>> groupedByProfession = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String profession = entry.getValue();
            Employee employee = entry.getKey();

            if (!groupedByProfession.containsKey(profession)) {
                groupedByProfession.put(profession, new ArrayList<>());
            }

            groupedByProfession.get(profession).add(employee);
        }

        return groupedByProfession;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Адам", "Адамович", 5000, 35);
        Employee employee2 = new Employee(2, "Борис", "Барташевич", 7000, 43);
        Employee employee3 = new Employee(3, "Владимир", "Войтехович", 6500, 25);
        Employee employee4 = new Employee(4, "Геннадий", "Гайдукевич", 5300, 33);
        Employee employee5 = new Employee(5, "Дмитрий", "Демидович", 4700, 29);
        Employee employee6 = new Employee(6, "Елена", "Ермолович", 3200, 54);
        Employee employee7 = new Employee(7, "Жизель", "Жинко", 2100, 29);
        Employee employee8 = new Employee(8, "Зинаида", "Зеленевич", 7100, 30);

        Map<Employee, String> employeeMap = new TreeMap<>(Comparator.comparingInt(Employee::getId));
        employeeMap.put(employee1, "Dev");
        employeeMap.put(employee2, "Dev");
        employeeMap.put(employee3, "Dev");
        employeeMap.put(employee4, "QA");
        employeeMap.put(employee5, "QA");
        employeeMap.put(employee6, "PM");
        employeeMap.put(employee7, "BA");
        employeeMap.put(employee8, "CEO");

        raiseSalaryForProfession(employeeMap, 500,"QA");
        System.out.println("Сотрудники после повышения зарплаты: ");
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ", Профессия: " + entry.getValue());
        }


        Map<String, List<Employee>> groupedByProfession = groupByProfession(employeeMap);

        System.out.println("\nСотрудники, сгруппированные по профессии:");
        for (Map.Entry<String, List<Employee>> entry : groupedByProfession.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Employee employee : entry.getValue()) {
                System.out.println("  " + employee);
            }
        }
    }
}





