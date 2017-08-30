package KawiarniaDekorator;

public class Main {

    public static void main(String[] args) {

        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        System.out.printf("Nazwa %s :: Cena %.2f", czek.pobierzOpis(),czek.koszt() );
        System.out.println("\n**************************************");
        Espresso es = new Espresso();
        Mleko milk = new Mleko(es);
        Czekolada czeko = new Czekolada(milk);
        System.out.printf("Nazwa %s :: Cena %.2f", czeko.pobierzOpis(),czeko.koszt());

    }
}
