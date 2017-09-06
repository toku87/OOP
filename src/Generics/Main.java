package Generics;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        Suitcase <Shirt> suitcase = new Suitcase<>();
        suitcase.setThing(shirt);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());




    }
}
