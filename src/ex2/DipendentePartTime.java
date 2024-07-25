package ex2;

import ex1.Dipendente;

import java.util.Random;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(double hourSalary) {
        super(hourSalary);
        Random random = new Random();
        this.weekHours = random.nextInt(20, 25);
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }

    @Override
    public String toString() {
        return "Dipendente Part Time " + matricola + " {" +
                "weekHours= " + weekHours +
                ", hourSalary= " + hourSalary +
                ", matricola= " + matricola +
                ", salary= " + salary +
                ", department= " + department +
                '}';
    }
}
