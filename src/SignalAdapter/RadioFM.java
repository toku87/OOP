package SignalAdapter;


import java.util.Random;


public class RadioFM implements IAnalogSignal {

    private double[] _tablica;



    public RadioFM (double[]tablica){
        for (int i = 0; i <8 ; i++) {
            Random rand = new Random();
            double value = 0 + (2 - 0) * rand.nextDouble();
           tablica[i] = value;
        }
        _tablica = tablica;
    }

    @Override
    public double[] getAnalog() {
        return new double[0] ;
    }

    @Override
    public void setAnalog(double[] analogData) {

    }

    @Override
    public void printAnalog() {
        for (double i : _tablica) {
            System.out.println(i);
        }
    }

}
