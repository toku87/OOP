package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaWabik extends Kaczka{

    public KaczkaWabik() {
        latanie = new NieLatam();
        kwakanie = new NieKwacze();
    }


    @Override
    public void wyswietl() {
        System.out.println("wygladam jak kaczka wabik");
    }
}
