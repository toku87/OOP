package WydawcaISubskrybent;


public interface IWydawca {

    void dodajPrenumeratora(IOdbiorca prenumerator);
    void usunPrenumeratora(IOdbiorca prenumerator);
    void wyslijNowyNumer();
}
