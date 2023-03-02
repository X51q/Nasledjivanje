package org.etsntesla.arm;

public class Ucenik extends Osoba {
    public String smer;
    public int razred;

    public Ucenik(String ime,int god,String smer,int razred){
        super(ime,god);
        this.smer=smer;
        this.razred=razred;
    }
    @Override
    public void info(){
        super.info();
        System.out.println(this.smer + "smera i " + this.razred + "godina pohadjanja");
    }
    @Override
    public String toString(){
        String izlaz=this.getIme()+" "+ this.god+" "+this.smer+ " "+this.razred;
        return izlaz;
    }
    public String OldToString(){
        return super.toString();
    }
}
