package TaxCounter;

/**
 * Created by Łukasz on 2017-08-29.
 */
public class cdBraveNewWorld implements IProduct{

    private String _name;
    private double _nettoPrice;

    public cdBraveNewWorld () {
        _name = "Brave New World";
        _nettoPrice = 25.99;
    }
    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getNettoPrice() {
        return _nettoPrice;
    }
}
