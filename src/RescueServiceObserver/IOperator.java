package RescueServiceObserver;


public interface IOperator {

    void removeObserver(IService services);

    void registerObserver(IService services);

    void notifyObservers();

    String getStatus();
}
