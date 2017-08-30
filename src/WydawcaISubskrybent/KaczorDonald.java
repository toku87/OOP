package WydawcaISubskrybent;


import java.util.ArrayList;
import java.util.List;

public class KaczorDonald implements IWydawca {

    private List<IOdbiorca> _odbiorcy;
    private String _numer;

    public KaczorDonald() {
        _odbiorcy = new ArrayList<>();

    }
    @Override
    public void dodajPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.add(prenumerator);
    }

    @Override
    public void usunPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.remove(prenumerator);
    }

    @Override
    public void wyslijNowyNumer() {
        for (IOdbiorca odbiorca : _odbiorcy) {
            odbiorca.odbierzGazete(_numer);
        }
    }

    public void wydajNumer(String numer) {
        _numer = numer;
        wyslijNowyNumer();
    }
}
