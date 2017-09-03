package ParzysteNieparzysteStrategia;


public class Drukarnia {

    protected IWypiszLiczby _liczby;

    public Drukarnia (IWypiszLiczby liczby){
        _liczby = liczby;
    }

    public void wydrukuj(){
        _liczby.wypisz();
    }

    public void setWypiszLiczby(IWypiszLiczby wypiszLiczby){
     this._liczby = wypiszLiczby;
    }
}
