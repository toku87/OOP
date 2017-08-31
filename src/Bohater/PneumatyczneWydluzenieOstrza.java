package Bohater;


public class PneumatyczneWydluzenieOstrza extends RozbudowaMiecz{

    private Miecz _miecz;

    public PneumatyczneWydluzenieOstrza (Miecz miecz){
        _miecz = miecz;
    }
    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " + automatycznie rozkładane, pneumatyczne wydłużenie ostrza";
    }

    @Override
    public int Atak() {
        return _miecz.Atak() + 40;
    }
}
