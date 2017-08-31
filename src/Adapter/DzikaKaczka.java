package Adapter;


public class DzikaKaczka implements IKaczka{
    @Override
    public void kwacz() {
        System.out.println("kwa kwa kwa");
    }

    @Override
    public void lataj() {
        System.out.println("lataj");
    }
}
