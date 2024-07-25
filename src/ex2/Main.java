package ex2;

import enums.Department;
import ex1.Dipendente;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dipendente dipFT = new DipendenteFullTime(10);
        /*dipFT.calculateSalary();
        System.out.println(dipFT);*/

        Dipendente dipPT = new DipendentePartTime(7.5);
        /*dipPT.calculateSalary();
        System.out.println(dipPT);*/

        Manager manager = new Manager(25);
        /*manager.calculateSalary();
        System.out.println(manager);*/

        Dipendente[] arrDip = new Dipendente[3];
        arrDip[0] = dipFT;
        arrDip[1] = dipPT;
        arrDip[2] = manager;
        System.out.println(Arrays.toString(arrDip));

        double totalSalaries = 0;
        for (Dipendente dipendente : arrDip) {
            dipendente.calculateSalary();
            totalSalaries += dipendente.getSalary();
        }
        System.out.println("Total salaries: " + totalSalaries);

        manager.assignDepartment(dipFT, Department.PRODUZIONE);
        manager.assignDepartment(dipPT, Department.VENDITE);
        manager.assignDepartment(manager, Department.AMMINISTRAZIONE);

        System.out.println(Arrays.toString(arrDip));

    }
}
