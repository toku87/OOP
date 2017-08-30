package WydawcaISubskrybent;


public class KubaM implements IOdbiorca {

    private IWydawca _gazeta;

    public KubaM (IWydawca gazeta) {
        zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Hurrraaaa, mam nowy numer %s ", numer);
    }
    public void rezygnujzGazety() {
        _gazeta.usunPrenumeratora(this);
    }
    public void zaprenumerujGazete(IWydawca gazeta) {
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);
    }
}
