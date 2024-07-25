package ex3;

import ex1.Dipendente;
import ex2.DipendenteFullTime;
import ex2.DipendentePartTime;
import ex2.Manager;

public class Main {
    public static void main(String[] args) {

        Dipendente dip1 = new DipendenteFullTime(40, 10);
        Dipendente dip2 = new DipendentePartTime(20, 9);
        Dipendente dip3 = new Manager(45, 25);
        Dipendente vol1 = new Volontario(30, 0, "Pippo", 26, "CV_ITA_2024");

        Dipendente[] arrDip = new Dipendente[4];
        arrDip[0] = dip1;
        arrDip[1] = dip2;
        arrDip[2] = dip3;
        arrDip[3] = vol1;

        for (Dipendente dipendente : arrDip) {
            dipendente.checkIn();
        }
    }
}