package RescueServiceObserver;


public class Ambulance implements IService{

    private IOperator _operator;

    public Ambulance (IOperator operator){
        this._operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
    driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(Ambulance.class.getSimpleName() + "code 290, I am going to incident address");
        System.out.println("Incident : " + _operator.getStatus() );

    }
}
