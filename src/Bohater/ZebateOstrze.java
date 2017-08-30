package Bohater;


public class ZebateOstrze extends RozbudowaMiecz{

    private Miecz _miecz;

    public ZebateOstrze (Miecz miecz){
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " + ostre, zębate ostrze";
    }

    @Override
    public int Atak() {
        return _miecz.Atak() + 20;
    }
}
