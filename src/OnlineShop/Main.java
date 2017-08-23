package OnlineShop;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        IProduct ChineseDemocracy = new ChineseDemocracy();
        ChineseDemocracy.setPrice(50);
        ChineseDemocracy.setProductName("GNR CD");

        IProduct HarryPotter = new HarryPotter();
        HarryPotter.setPrice(250);
        HarryPotter.setProductName("HP book");

        ArrayList <IProduct> koszyk  = new ArrayList <>();
        koszyk.add(ChineseDemocracy);
        koszyk.add(HarryPotter);

        int cena = 0;

        for (IProduct iProduct : koszyk) {
            cena = cena + iProduct.getPrice();
        }
        System.out.println(cena);
    }

}
