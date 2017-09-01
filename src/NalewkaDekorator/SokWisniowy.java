package NalewkaDekorator;

public class SokWisniowy extends SkładnikiNalewka {

    private Nalewka _nalewka;

    public SokWisniowy (Nalewka nalewka){
        _nalewka = nalewka;
    }
    @Override
    public String pobierzOpis() {
        return " sok wiśniowy";
    }

    @Override
    public int Moc() {
        return _nalewka.Moc();
    }
}
