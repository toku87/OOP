package EkspresAdapter;


public class TassimoAdapter implements IDolceGusto {

    private Tassimo _tassimo;

    public TassimoAdapter (Tassimo tassimo) {
        _tassimo = tassimo;
    }

    @Override
    public void zrobKaweZKapsulkiNescafe() {
        _tassimo.zrobKaweZKapsulkiBosch();
    }
}
