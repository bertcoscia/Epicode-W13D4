package ex2;

import ex1.Dipendente;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int weekHours, double hourSalary) {
        super(weekHours, hourSalary);
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }

    @Override
    public String toString() {
        return "Dipendente Part Time " + matricola + " {" +
                "weekHours=" + weekHours +
                ", hourSalary=" + hourSalary +
                ", matricola=" + matricola +
                ", salary=" + salary +
                ", dipartimento=" + department +
                '}';
    }
}
