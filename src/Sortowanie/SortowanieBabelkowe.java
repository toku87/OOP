package Sortowanie;

/**
 * Created by RENT on 2017-08-28.
 */
public class SortowanieBabelkowe implements ISortowanie {

    @Override
    public int [] sort( int [] tab) {

        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[i] < tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        return tab;

    }
}
