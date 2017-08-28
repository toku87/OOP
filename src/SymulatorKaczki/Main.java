package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {

    public static void main(String[] args) {
//        PlaskonosKaczka pk = new PlaskonosKaczka();
//        pk.wyswietl();
//        pk.wykonajKwakanie();
//        DzikaKaczka dk = new DzikaKaczka();
//        dk.wykonajKwakanie();
//
//        System.out.println("*******************************8");
//
//        GumowaKaczka gk = new GumowaKaczka();
//        gk.wykonajKwakanie();
//        gk.wykonajLatanie();
//        gk.wyswietl();
//
//        KaczkaWabik kw = new KaczkaWabik();
//        kw.wykonajKwakanie();
//        kw.wykonajLatanie();
//        kw.wyswietl();

        KaczkaModel km = new KaczkaModel();
        km.wyswietl();
        km.wykonajLatanie();
        km.setLatanie(new LotZNapedemRakietowym());
        km.wykonajLatanie();
    }
}
