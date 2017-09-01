package Bohater;

public class Bohater {

    private String _imie;

    private int max = 100; // miałem problem z ustawieniem wartosci max dla atrybutów, jeszcze znajdę rozwiązanie

    private Tarcza _obrona;
    private Miecz _atak;
    private Plecak _pojemnoscZasobnika;

    public Bohater (String imie){
        _imie = imie;
    }

    public void Obrona(Tarcza obrona) {
        _obrona = obrona;
        obrona.Obrona();
    }

    public void Atak(Miecz atak){
        _atak = atak;
        atak.Atak();
    }

    public void Plecak (Plecak pojemnoscZasobnika){
        _pojemnoscZasobnika = pojemnoscZasobnika;
        pojemnoscZasobnika.PojemnoscZasobnika();

    }

    public String toString(){
        return String.format("Bohater %s posiada do obrony %s  a jego wartość obrony wynosi %d. \n" +
                        "Do ataku ma do dyspozycji %s, a jego siła ataku wynosi %d \n" +
                        "Swój ekwipunek nosi w %s, a pojemność jego zasobnika jest równa %d "
                ,_imie, _obrona.pobierzOpis(), _obrona.Obrona(), _atak.pobierzOpis(),_atak.Atak(), _pojemnoscZasobnika.pobierzOpis(),_pojemnoscZasobnika.PojemnoscZasobnika());
    }
}

