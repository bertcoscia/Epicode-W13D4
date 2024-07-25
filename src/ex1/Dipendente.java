package ex1;

import enums.Department;

import java.util.Random;

public abstract class Dipendente {
    protected int matricola;
    protected double salary;
    protected Department department;
    String name;

    public Dipendente() {
        Random random = new Random();
        this.matricola = random.nextInt(1000, 9999);
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

    protected void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", salary=" + salary +
                ", dipartimento=" + department +
                '}';
    }
}
