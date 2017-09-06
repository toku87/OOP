package Generics;


public class Shirt extends Clothes implements ICanBeFolded{
    @Override
    public String getTagDescription() {
        return "100% Cotton";
    }

    @Override
    public String getName() {
        return "Shirt";
    }

    @Override
    public String getSize() {
        return "M";
    }
}
