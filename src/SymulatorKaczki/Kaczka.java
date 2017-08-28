package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public abstract class Kaczka {
    protected ILatanie latanie;
    protected IKwakanie kwakanie;


    public void plywaj () {
        System.out.println("Pływu, pływu");
    }
    public void wyswietl() {
        System.out.println("Wyswietlam kaczke");
    }

    public void wykonajLatanie() {
        latanie.lec();
    }
    public void wykonajKwakanie() {
        kwakanie.kwacz();
    }
    public void setLatanie(ILatanie latanie) {
        this.latanie = latanie;
    }
    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
    }

