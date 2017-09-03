package ParzysteNieparzysteStrategia;


public class LiczbyParzyste implements IWypiszLiczby{

    private int [] tab;
    private int n;

    public LiczbyParzyste (int n){
        tab = new int[n];
    }

    @Override
    public void wypisz() {
        for (int i = 0; i <tab.length ; i++) {
             tab[i] = i;
        }
        for (int i : tab) {
            if (tab[i] % 2 == 0) {
                System.out.println(tab[i] + "");
            }
        }
    }
}
