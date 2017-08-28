package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaModel extends Kaczka {

    public KaczkaModel () {
        kwakanie = new NieKwacze();
        latanie = new LatamBoMamSkrzydla();
    }
    @Override
    public void wyswietl () {
        System.out.println("jestem kaczka modelem z papieru");
    }
}
