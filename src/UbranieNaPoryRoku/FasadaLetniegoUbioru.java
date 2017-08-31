package UbranieNaPoryRoku;


public class FasadaLetniegoUbioru implements IUbraniePoraRoku{

    private Skarpetki _skarpetki;

    public FasadaLetniegoUbioru (Skarpetki skarpetki){
        _skarpetki = skarpetki;
    }

    @Override
    public void ubierzSie() {
        _skarpetki.ubierzUbranie();
    }

    @Override
    public void rozbierzSie() {
        _skarpetki.zdejmijUbranie();

    }
}
