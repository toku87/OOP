package NalewkaDekorator;


public class Spirytus extends Nalewka{

    public Spirytus() {
        opis = "Podwójnie destylowany spirytus";
    }

    @Override
    public int Moc() {
        return 90;
    }
}
