package FruitBasketGenerics;


public class Apple extends Fruit implements IFruit {

    @Override
    public String getFruitName() {
        return "Apple";
    }

    @Override
    public String getFruitDescription() {
        return "Green, not so big, full natural";
    }

    @Override
    public String getCountryOfOrigin() {
        return "Poland";
    }
}
