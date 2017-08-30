package Bohater;


public class ObudowaZKosciWampirzych extends RozbudowaTarcza{

    private Tarcza _tarcza;

    public ObudowaZKosciWampirzych (Tarcza tarcza){
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " + obudowa z kości wampirzych";
    }

    @Override
    public int Obrona() {
        return _tarcza.Obrona() + 50;
    }
}
