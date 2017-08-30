package RescueServiceObserver;


import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements IOperator{

    List<IService>service;
    private String _status = "";

    public OperatorAdam (){
        service = new ArrayList<>();
    }


    @Override
    public void registerObserver(IService services) {
        service.add(services);

    }

    @Override
    public void removeObserver(IService services) {
        service.remove(services);

    }

    @Override
    public void notifyObservers() {
        for (IService services : service) {
            services.update();
        }
    }

    @Override
    public String getStatus() {
        return _status;
    }
    public void setStatus(String status) {
        this._status = status;
        notifyObservers();
    }

}
