package ex3;

import ex1.Dipendente;
import interfaces.Worker;

public class Volontario extends Dipendente implements Worker {
    String name;
    int age;
    String cv;

    public Volontario(int weekHours, double hourSalary, String name, int age, String cv) {
        super(weekHours, hourSalary);
        this.name = name;
        this.age = age;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println(java.time.LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Volontario " + name + " {" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", cv= '" + cv + '\'' +
                '}';
    }

    @Override
    public void calculateSalary() {
        double monthSalary = (this.hourSalary * this.weekHours) * 4;
        this.setSalary(monthSalary);
    }
}
