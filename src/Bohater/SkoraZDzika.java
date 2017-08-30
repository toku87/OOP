package Bohater;


public class SkoraZDzika extends RozbudowaTarcza{

    private Tarcza _tarcza;

    public SkoraZDzika (Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " + powleczona grubą skórą z dzika";
    }

    @Override
    public int Obrona() {
        return _tarcza.Obrona() + 15;
    }
}
