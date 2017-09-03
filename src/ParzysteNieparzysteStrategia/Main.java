package ParzysteNieparzysteStrategia;


public class Main {

    public static void main(String[] args) {
        Drukarnia dk = new Drukarnia(new LiczbyNieparzyste(20));
       dk.wydrukuj();
       dk.setWypiszLiczby(new LiczbyParzyste(30));
        System.out.println("************************");
       dk.wydrukuj();
       dk._liczby.wypisz();

    }
}
