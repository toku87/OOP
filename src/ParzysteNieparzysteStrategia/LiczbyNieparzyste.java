package ParzysteNieparzysteStrategia;


public class LiczbyNieparzyste  implements IWypiszLiczby  {

    private int[] tab;
    private int n;

    public LiczbyNieparzyste(int n) {
        tab = new int[n];
    }

    @Override
    public void wypisz() {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }
        for (int i : tab) {
            if (tab[i] % 2 != 0) {
                System.out.println(tab[i] + "");
            }
        }
    }
}





