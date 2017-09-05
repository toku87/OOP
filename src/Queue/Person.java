package Queue;

public class Person {
    private String _name;
    private String _shoppingList;

    public Person (String name, String shoppingList) {
        _name = name;
        _shoppingList = shoppingList;
    }
    public String getName(){
        return _name;
    }
    public String unpackShopping(){
        return "Wypakowuje na taśmę : " + _shoppingList;
    }


    }


