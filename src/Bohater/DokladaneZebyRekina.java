package Bohater;


public class DokladaneZebyRekina extends RozbudowaMiecz{

    private Miecz _miecz;

    public DokladaneZebyRekina (Miecz miecz){
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + "doczepione, twarde zęby rekina";
    }

    @Override
    public int Atak() {
        return _miecz.Atak() + 40;
    }
}
