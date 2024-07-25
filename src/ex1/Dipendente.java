package ex1;

import enums.Department;
import interfaces.Worker;

import java.util.Random;


public abstract class Dipendente implements Worker {
    protected int matricola;
    protected double salary;
    protected Department department;
    protected int weekHours;
    protected double hourSalary;

    public Dipendente(double hourSalary) {
        Random random = new Random();
        this.matricola = random.nextInt(1000, 9999);
        this.hourSalary = hourSalary;
    }

    public abstract void calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola= " + matricola +
                ", salary= " + salary +
                ", dipartimento= " + department +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println(java.time.LocalDateTime.now());
    }
}
