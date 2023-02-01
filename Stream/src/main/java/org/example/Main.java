package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        {
            employees.add(new Employee("Vedha", "prakash", 10000, List.of("project 1", "project 2")));
            employees.add(new Employee("keerthi", "achu", 20000, List.of("project 1", "project 3")));
            employees.add(new Employee("prabha", "sandy", 30000, List.of("project 1", "project 4")));
            employees.add(new Employee("ramesh", "aravind", 40000, List.of("project 1", "project 5")));

            //  employees.stream().forEach(employee -> System.out.println(employee));

            employees.stream().map(employee -> new Employee(employee.getFirstname(),
                    employee.getLastname(),
                    employee.getSalary(),
                    employee.getProjects()
            )).collect(Collectors.toList());

            System.out.println(employees); // list of employees

        }
    }
}