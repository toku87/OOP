package RescueServiceObserver;


public interface IOperator {

    void registerObserver();

    void removeObserver();

    void notifyObservers();
}
