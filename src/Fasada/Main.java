package Fasada;


public class Main {

    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tx = new ThermoMix();
        Wzmacniacz wza = new Wzmacniacz();
        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv,tx,wza);
        fkd.wrocDoDomu();
    }
}
