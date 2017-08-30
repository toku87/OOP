package Bohater;


public class PancerzRosomaka extends RozbudowaTarcza{

    private Tarcza _tarcza;

    public PancerzRosomaka(Tarcza tarcza){
        _tarcza = tarcza;
    }

    @Override
    public int Obrona() {
        return _tarcza.Obrona() + 30;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " + pancerz z rosomaka Australijskiego";
    }
}
