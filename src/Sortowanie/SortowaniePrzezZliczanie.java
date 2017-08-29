package Sortowanie;


public class SortowaniePrzezZliczanie  implements ISortowanie {

    @Override
        public int[] sort(int[] tab) {
            int max = getMax(tab);
            int[] countTab = new int[max+1];

            for(int i = 0; i < tab.length; i++){
                countTab[tab[i]]++; //zliczam elementy
                //Innymi słowy:
                // int toAdd = tab[i];
                // countTab[toAdd]++;
            }

            int[] finalTab = new int[tab.length]; //tworzę tablicę, którą zwrócę
            int iterator = 0; //iterator - posłuży mi do odpowiedniego ustawiania elementów w tablicy
            for(int i = 0; i < countTab.length; i++){ //idę po całej tablicy w której mam zliczone wartości
                while (countTab[i] > 0) //dopóki została mi jakaś liczba do dodania do końcowej tablicy
                {
                    finalTab[iterator] = i; //przypisuje jej miejsce
                    countTab[i]--; //odejmuje ją od zliczonych
                    iterator++; //zwiększam iterator
                }
            }

            return finalTab;
        }

    private int getMax(int[] tab){
        int max = 0;
        for(int i =0; i < tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
}

