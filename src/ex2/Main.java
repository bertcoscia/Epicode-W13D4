package ex2;

import ex1.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new DipendenteFullTime(40, 10);
        /*dip1.calculateSalary();
        System.out.println(dip1);*/

        Dipendente dip2 = new DipendentePartTime(20, 9);
        /*dip2.calculateSalary();
        System.out.println(dip2);*/

        Dipendente dip3 = new Manager(45, 25);
        /*dip3.calculateSalary();
        System.out.println(dip3);*/

        Dipendente[] arrDip = new Dipendente[3];
        arrDip[0] = dip1;
        arrDip[1] = dip2;
        arrDip[2] = dip3;

        double totalSalaries = 0;
        for (Dipendente dipendente : arrDip) {
            dipendente.calculateSalary();
            totalSalaries += dipendente.getSalary();
            dipendente.checkIn();
        }
        System.out.println(totalSalaries);
    }
}
