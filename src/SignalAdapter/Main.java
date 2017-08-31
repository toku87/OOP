package SignalAdapter;


public class Main {

    public static void main(String[] args) {
        RadioFM fm = new RadioFM(new double[8]);
        RadioFM fm2 = new RadioFM(new double[8]);
        fm.printAnalog();
        fm2.printAnalog();
    }
}
