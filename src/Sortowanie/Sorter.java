package Sortowanie;


public class Sorter {

    protected ISortowanie _sortowanie;

    public Sorter (ISortowanie sortowanie) {
        setSortowanie(sortowanie);
    }
    public void setSortowanie (ISortowanie sortowanie) {
        _sortowanie = sortowanie;
    }
    public int [] wykonajSortowanie (int [] toSort) {
        return _sortowanie.sort(toSort);
    }
}

