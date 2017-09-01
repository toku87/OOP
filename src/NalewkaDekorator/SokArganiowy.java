package NalewkaDekorator;


public class SokArganiowy extends SkładnikiNalewka{

    private Nalewka _nalewka;

    public SokArganiowy (Nalewka nalewka) {
        _nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return " sok arganiowy ";
    }

    @Override
    public int Moc() {
        return _nalewka.Moc();
    }
}
