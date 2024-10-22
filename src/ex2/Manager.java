package ex2;

import enums.Department;
import ex1.Dipendente;

public class Manager extends Dipendente {

    public Manager(double hourSalary) {
        super(hourSalary);
        this.weekHours = 45;
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }

    @Override
    public String toString() {
        return "Manager" + matricola + " {" +
                "weekHours= " + weekHours +
                ", hourSalary= " + hourSalary +
                ", matricola= " + matricola +
                ", salary= " + salary +
                ", department= " + department +
                '}';
    }

    public void assignDepartment(Dipendente dip, Department department) {
        dip.setDepartment(department);
    }
}
