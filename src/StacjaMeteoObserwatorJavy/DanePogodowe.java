package StacjaMeteoObserwatorJavy;

import java.util.Observable;

public class DanePogodowe extends Observable {

    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;

    public DanePogodowe() {}

    //deklaracja zmiennych obiektowych
    public void odczytyZmiennych() {
        setChanged();
        notifyObservers();
    }

    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc) {
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        odczytyZmiennych();
    }

    public float getTEmperatura() {
        return _temperatura;
    }

    public float getCisnienie () {
        return _cisnienie;
    }

    public float getWilgotnosc() {
        return _wilgotnosc;
    }
}