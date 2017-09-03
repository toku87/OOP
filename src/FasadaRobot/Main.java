package FasadaRobot;


public class Main {

    public static void main(String[] args) {
        CukierPuder cp = new CukierPuder();
        Ibuprofen ibu = new Ibuprofen();
        Talk talk = new Talk();
        FormaTabletek ft = new FormaTabletek();
        FasadaRobotProdukcyjny frb = new FasadaRobotProdukcyjny(cp, ibu, talk, ft);
        frb.przygotujPorcje();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        frb.przygotujTabletki();

    }

}
