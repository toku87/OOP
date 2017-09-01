package Singleton;


public class Singleton {

    private static Singleton _instancja;
    private Singleton () {}
    public static Singleton getInstance() {
        if (_instancja == null) {
            _instancja = new Singleton();
        }
        return _instancja;
    }
}
