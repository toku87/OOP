package Sortowanie;


public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new SortowanieBabelkowe());
        int [] tabToSort = {1,3,6,7,4,3};
        int[] sorted = sorter.wykonajSortowanie(tabToSort);
        for (int  i : sorted) {
            System.out.println(i);
        }

    }
}
