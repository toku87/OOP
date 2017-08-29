package Sortowanie;


public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new SortowanieBabelkowe());
        int[] tabToSort = {4, 6, 3, 2, 0, 1, 9, 9, 9};
        int[] sorted = sorter.wykonajSortowanie(tabToSort);
        for (int i : sorted) {
            System.out.println(i);
        }

        System.out.println("******************");


        Sorter sorter2 = new Sorter(new SortowaniePrzezZliczanie());
        int tab2[] = {4, 6, 3, 2, 0, 1, 9, 9, 9};
        int sorted2[] = sorter2.wykonajSortowanie(tab2);
        for (int i : sorted2) {
            System.out.println(i);
        }
    }
}

