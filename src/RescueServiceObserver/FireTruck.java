package RescueServiceObserver;


public class FireTruck implements IService{

    private IOperator _operator;

    public FireTruck (IOperator operator) {
        this._operator = operator;
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(FireTruck.class.getSimpleName() + "code 250, I am going to incident address");
        System.out.println("Incident : " + _operator.getStatus() );
    }
}
