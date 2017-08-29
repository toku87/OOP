package StacjaMeteo;

/**
 * Created by RENT on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);
        dp.ustawZmienne(13,1033,50);
    }
}
