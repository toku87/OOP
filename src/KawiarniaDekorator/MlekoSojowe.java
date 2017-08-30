package KawiarniaDekorator;


public class MlekoSojowe extends SkladnikiDekorator{

    private Napoj _napoj;

    public MlekoSojowe (Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " mleko sojowe";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.15;
    }
}
