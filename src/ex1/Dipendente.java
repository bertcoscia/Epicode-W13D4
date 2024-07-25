package ex1;

import enums.Dipartimento;

import java.util.Random;

public class Dipendente {
    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente() {
        Random random = new Random();
        this.matricola = random.nextInt(1000, 10000);
        this.stipendio = 1000;
        this.dipartimento = Dipartimento.VENDITE;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    protected void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
