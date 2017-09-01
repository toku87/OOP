package NalewkaDekorator;


public class Woda extends SkładnikiNalewka {

    private Nalewka _nalewka;

    public Woda (Nalewka nalewka) {
        _nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return " porcja wody";
    }

    @Override
    public int Moc() {
        return _nalewka.Moc() - 8;
    }
}
