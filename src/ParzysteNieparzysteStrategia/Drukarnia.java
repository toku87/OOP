package ParzysteNieparzysteStrategia;


public class Drukarnia {

    protected IWypiszLiczby _liczby;

    public void setWypiszLiczby(IWypiszLiczby wypiszLiczby){
     this._liczby = wypiszLiczby;
    }
    public Drukarnia (IWypiszLiczby liczby){
        _liczby = liczby;
    }
}
