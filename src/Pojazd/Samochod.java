package Pojazd;


public class Samochod implements ICzterokolowy {

    @Override
    public void jedz() {
        System.out.println("Jade Brym Brym ...");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje IIIIIIII!!!!!");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Jade na czolowke \n");
    }
}
