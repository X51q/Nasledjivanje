package org.etsntesla.arm;

public class Osoba {

    private String ime;
    public int god;

    public Osoba(String ime,int god){
        this.ime=ime;
        this.god=god;
    }
    public String getIme(){
        return this.ime;
    }
public void info(){
    System.out.println(this.ime + "ime" + this.god + "godina");
}
    public static String tipOsobe(Object obj){
        String tmp="Objekat je instanca klase";
        if (obj instanceof Ucenik)
            return tmp+"Ucenik";
        if (obj instanceof Profesor)
            return tmp+ "Profesor";
        if(obj instanceof Osoba)
            return tmp+ "Osoba";
        return "objekat je instanca nepoznate klase";
    }
}
