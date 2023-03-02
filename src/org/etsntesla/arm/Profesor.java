package org.etsntesla.arm;

public class Profesor extends Osoba {
    String[] predmeti;

    public Profesor(String ime, int god) {
        super(ime, god);
        predmeti = new String[5];
    }

    public boolean dodajPredmet(String predmet, int indeks) {
        if (indeks >= 0 && indeks <= 4) {
            predmeti[indeks] = predmet;
            return true;
        }else {
            return false;
        }
    }
}
