package FruitBasketGenerics;


public class FruitBasket <T extends Fruit & IFruit> {

    private T _fruit;

    public T getFruit(){
        return _fruit;
    }
    public void setFruit (T fruit){
        _fruit = fruit;
    }
    public String getFruitName(){
        return _fruit.getFruitName();
    }
    public String getFruitDescription(){
        return _fruit.getFruitDescription();
    }
    public String getCuntryOfOrigin(){
        return _fruit.getCountryOfOrigin();
    }
}
