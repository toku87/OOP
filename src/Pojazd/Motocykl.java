package Pojazd;


public class Motocykl implements IDwukolowy{
    @Override
    public void jedz() {
        System.out.println("Jade wruuuum");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje IIIIIII!!!");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Bum, jestem na boku");
    }
    public void dodajGazu() {
        System.out.println("Gazujeeeee ...");
    }
}
