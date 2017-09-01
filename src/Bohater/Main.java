package Bohater;


public class Main {

    public static void main(String[] args) {
        Bohater bohater = new Bohater("Niezwyciężony Andrzej z wąsem");
        TarczaMetalowa tm = new TarczaMetalowa();
        SkoraZDzika sk = new SkoraZDzika(tm);
        ObudowaZKosciWampirzych okw = new ObudowaZKosciWampirzych(sk);
        PancerzRosomaka pr = new PancerzRosomaka(okw);
        bohater.Obrona(pr);
        MieczObusieczny mo = new MieczObusieczny();
        ZebateOstrze zo = new ZebateOstrze(mo);
        PneumatyczneWydluzenieOstrza pwo = new PneumatyczneWydluzenieOstrza(zo);
        bohater.Atak(pwo);
        PlecakWloczykija plecak = new PlecakWloczykija();
        SkorzanaSakwa ss = new SkorzanaSakwa(plecak);
        bohater.Plecak(ss);
        bohater.toString();
        System.out.println(bohater);
    }
}
