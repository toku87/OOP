package RescueServiceObserver;


public class Main {

    public static void main(String[] args) {

        OperatorAdam adam = new OperatorAdam();
        Ambulance ambulance = new Ambulance(adam);
        Police police = new Police(adam);
        FireTruck firetruck = new FireTruck(adam);

        adam.setStatus("Car accident on A4 highway");
        ambulance.update();
        police.update();
        firetruck.update();
        adam.removeObserver(ambulance);
        adam.setStatus("Car on fire, three people are dead");
        adam.notifyObservers();
        System.out.println("*****************");
        police.update();
        ambulance.update();
        firetruck.update();
    }
}
