package FruitBasketGenerics;


public class Banana extends Fruit implements IFruit {
    @Override
    public String getFruitName() {
        return "Banana";
    }

    @Override
    public String getFruitDescription() {
        return "Yellow, curved and very tasty";
    }

    @Override
    public String getCountryOfOrigin() {
        return "Ecuador";
    }
}
