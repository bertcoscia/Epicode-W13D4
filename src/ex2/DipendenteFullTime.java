package ex2;

import ex1.Dipendente;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(double hourSalary) {
        super(hourSalary);
        this.weekHours = 40;
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }

    @Override
    public String toString() {
        return "Dipendente Full Time " + matricola + " {" +
                "weekHours= " + weekHours +
                ", hourSalary= " + hourSalary +
                ", matricola= " + matricola +
                ", salary= " + salary +
                ", department= " + department +
                '}';
    }
}
