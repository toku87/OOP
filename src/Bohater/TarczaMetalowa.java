package Bohater;

public class TarczaMetalowa extends Tarcza{

    public TarczaMetalowa() {
        opis = "Tarcza metalowa";
    }

    @Override
    public int Obrona() {
        return 20;
    }
}
