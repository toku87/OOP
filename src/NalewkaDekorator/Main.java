package NalewkaDekorator;


public class Main {

    public static void main(String[] args) {

        Spirytus sp = new Spirytus();
        SokWisniowy sw = new SokWisniowy(sp);
        Woda woda = new Woda(sw);
        Woda woda2 = new Woda(woda);
        Woda woda3 = new Woda(woda2);

        System.out.printf("Nalewka Tymoteusza składa się z : %s :: %s :: %s . Kopie dość mocno, bo ma %d woltarzu",
                sp.pobierzOpis(),sw.pobierzOpis(),woda.pobierzOpis(),woda3.Moc());
    }
}
