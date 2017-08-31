package UbranieNaPoryRoku;

/**
 * Created by RENT on 2017-08-31.
 */
public class StrategiaUbioru {

    private IUbraniePoraRoku _ubraniePoraRoku;

    public StrategiaUbioru (IUbraniePoraRoku ubraniePoraRoku) {
        _ubraniePoraRoku = ubraniePoraRoku;
    }
    public void ubieramySie(){
        _ubraniePoraRoku.ubierzSie();
    }
    public void rozbieramySie() {
        _ubraniePoraRoku.rozbierzSie();
    }
    public void setPoraRoku (IUbraniePoraRoku ubraniePoraRoku) {
        _ubraniePoraRoku = ubraniePoraRoku;
    }
}

