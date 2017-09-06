package FruitBasketGenerics;


public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        FruitBasket <Apple> fb = new FruitBasket<>();
        fb.setFruit(apple);
        System.out.println(fb.getFruitName());
        System.out.println(fb.getCuntryOfOrigin());

    }
}
