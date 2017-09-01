package NalewkaDekorator;

public class SokMalinowy extends SkładnikiNalewka {

    private Nalewka _nalewka;

    public SokMalinowy (Nalewka nalewka) {
        _nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return "sok malinowy";
    }

    @Override
    public int Moc() {
        return _nalewka.Moc();

    }
}
