package Adapter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();
        IndykAdapter ia = new IndykAdapter(indyk);
        KaczkaAdapter ka = new KaczkaAdapter(kaczka);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(ia);
        uruchomKwakanieILatanie(ptaki);

        System.out.println("******************************************");

        ArrayList<IIndyk> ptaki2 = new ArrayList<>();
        ptaki2.add(indyk);
        ptaki2.add(ka);
        uruchomGulgotanieILatanie(ptaki2);
    }

    public static void uruchomKwakanieILatanie (ArrayList<IKaczka> ptaki) {
        for (IKaczka kaczka : ptaki) {
            kaczka.kwacz();
            kaczka.lataj();
        }
    }

    public static void uruchomGulgotanieILatanie (ArrayList<IIndyk> ptaki2) {
        for (IIndyk indyk : ptaki2) {
            indyk.gulgocze();
            indyk.lataj();
        }
    }
}
