package org.example.homework_nr_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("Dmitri", "Timotin", 38, false, false),
                new Employee("Petru", "Racu", 38, true, true),
                new Employee("Alex", "Apostol", 45, true, true),
                new Employee("Victor", "Bairamov", 30, true, true),
                new Employee("Andrei", "Paicu", 33, false, false),
                new Employee("Maxim", "Carol", 32, false, false),
                new Employee("Pavel", "Costin", 21, false, false),
                new Employee("Eugene", "Baltaga", 39, true, true),
                new Employee("Oleg", "Pantea", 42, true, true),
                new Employee("Mircea", "Gherciu", 40, true, true)


        ));


        employeeList.stream()
                .filter(e -> e.getCanConductInterview() && e.getPayedByHour())
                .filter(e -> e.getAge() > 25)
                .limit(5)
                .forEach(e -> System.out.println(e));

        System.out.println("----------------------------------");

        List<String> namesList = employeeList.stream()
                .filter(e -> !e.getPayedByHour())
                .filter(e -> e.getAge() > 30)
                .map(e -> e.getName())
                .sorted()
                .collect(Collectors.toList());

        namesList.forEach(e -> System.out.println(e));

        System.out.println("------------------------------");

        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(e -> e.getCanConductInterview() && e.getPayedByHour())
                .findFirst();

        if (optionalEmployee.isPresent())
            System.out.println(optionalEmployee.get());
        else
            System.out.println("Employee was not found!");

        System.out.println("_______________________________");

        List<Employee> sortedBySurname = employeeList.stream()
                .sorted(((o1, o2) -> o1.getSurname().compareTo(o2.getSurname())))
                .collect(Collectors.toList());

        for (Employee e : sortedBySurname)
            System.out.println(e.toString());


    }
}
