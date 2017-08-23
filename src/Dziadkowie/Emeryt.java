package Dziadkowie;


public abstract class Emeryt {

        public static final int ILOSC_OCZU = 2;
        public abstract void krzyczNaDzieci();


        public void biegnijDoSklepu(int odleglosc, int predkosc) {
            double czas = (double) odleglosc / predkosc;
            System.out.println("Biegne po kiełbase bede za " + czas);
        }
        public abstract void walczOMiejsceWAutobusie();
}
