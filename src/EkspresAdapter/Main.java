package EkspresAdapter;

public class Main {

    public static void main(String[] args) {
        DolceGusto dg = new DolceGusto();
        Tassimo tas = new Tassimo();
        TassimoAdapter ta = new TassimoAdapter(tas);
        ta.zrobKaweZKapsulkiNescafe();
    }
}
