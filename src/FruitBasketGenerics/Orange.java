package FruitBasketGenerics;

public class Orange extends Fruit implements IFruit {
    @Override
    public String getFruitName() {
        return "Orange";
    }

    @Override
    public String getFruitDescription() {
        return "Big, round, from plantation";
    }

    @Override
    public String getCountryOfOrigin() {
        return "Chile";
    }
}
