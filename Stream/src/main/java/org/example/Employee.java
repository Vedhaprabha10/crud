package org.example;

import java.util.List;

public class Employee {

    private String firstname;
    private String lastname;
    private int salary;
    private List<String> projects;

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public Employee(String firstname, String lastname, int salary, List<String> projects) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.projects = projects;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }
}
