package org.etsntesla.arm;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1,osoba2;
        osoba1=new Osoba("Mika",17);
        osoba2=new Osoba("Zika",18);
        Ucenik ucenik1,ucenik2,ucenik3;
        ucenik1=new Ucenik("Petar",15,"ARM",1-4);
        ucenik2=new Ucenik("Marko",17,"ARM",3-4);
        ucenik3=new Ucenik("Andrija",16,"ARM",2-4);
        Profesor profesor1,profesor2;
        profesor1=new Profesor("Nikola",47);
        profesor2=new Profesor("Ilija",34);
    }
}