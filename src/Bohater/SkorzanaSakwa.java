package Bohater;


public class SkorzanaSakwa extends RozbudowaPlecak{

    private Plecak _plecak;

    public SkorzanaSakwa (Plecak plecak){
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " + skórzana sakwa";
    }

    @Override
    public int PojemnoscZasobnika() {
        return _plecak.PojemnoscZasobnika() + 1;
    }
}
