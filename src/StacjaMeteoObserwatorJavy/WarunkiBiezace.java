package StacjaMeteoObserwatorJavy;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements IWyswietl, Observer {
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private Observable _danePogodowe;

    WarunkiBiezace(Observable danePogodowe) {
        _danePogodowe = danePogodowe;
        _danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane : %f st C, %f  hPa, %f %% \n",_temperatura,_cisnienie,_wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe)
        _cisnienie = ((DanePogodowe) o).getCisnienie();
        _temperatura = ((DanePogodowe) o).getTEmperatura();
        _wilgotnosc = ((DanePogodowe) o).getWilgotnosc();
        wyswietl();
    }
}
