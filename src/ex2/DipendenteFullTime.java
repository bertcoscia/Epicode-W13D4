package ex2;

import ex1.Dipendente;

import java.util.Random;

public class DipendenteFullTime extends Dipendente {

    protected int weekHours;
    protected double hourSalary;

    public DipendenteFullTime(int weekHours, double hourSalary) {
        Random random = new Random();
        this.matricola = random.nextInt(1000, 9999);
        this.weekHours = weekHours;
        this.hourSalary = hourSalary;
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }

    @Override
    public String toString() {
        return "Dipendente Full Time " + matricola + " {" +
                "weekHours=" + weekHours +
                ", hourSalary=" + hourSalary +
                ", matricola=" + matricola +
                ", salary=" + salary +
                ", dipartimento=" + department +
                '}';
    }
}