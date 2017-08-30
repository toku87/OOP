package RescueServiceObserver;


public class Police implements IService{

    private IOperator _operator;

    public Police (IOperator operator) {
        this._operator = operator;
    }
    @Override
    public void update() {
    driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(Police.class.getSimpleName() + "code 210, I am going to incident address");
        System.out.println("Incident : " + _operator.getStatus() );

    }
}
