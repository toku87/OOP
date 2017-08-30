package WydawcaISubskrybent;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        KaczorDonald kd = new KaczorDonald();
        Fakt fakt = new Fakt();

        KubaM km = new KubaM(kd);

        kd.wydajNumer("KD : 01/2017");
        Thread.sleep(4000);
        System.out.println();

        kd.wydajNumer("KD : 02/2017");
        Thread.sleep(4000);
        System.out.println();

        km.rezygnujzGazety();
        System.out.println("********");
        kd.wydajNumer("03/2017");
    }
}
