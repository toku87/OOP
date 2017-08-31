package Fasada;

public class FasadaKinaDomowego {

    private Telewizor _telewizor;
    private ThermoMix _thermomix;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego (Telewizor telewizor, ThermoMix thermomix, Wzmacniacz wzmacniacz) {
        _telewizor = telewizor;
        _thermomix = thermomix;
        _wzmacniacz = wzmacniacz;
    }
    public void wrocDoDomu(){
        _thermomix.wlacz();
        _thermomix.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }
    public void wychodzeZDomu() {
        _thermomix.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
