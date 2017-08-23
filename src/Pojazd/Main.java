package Pojazd;

public class Main {

    public static void main(String[] args) {
        IPojazd rower = new Rower();
        rower.jedz();
        IDwukolowy drugiRower = new Rower();
        Motocykl moto = new Motocykl();
        IDwukolowy moto2 = new Motocykl();
        ICzterokolowy auto = new Samochod();

    }
}
