package RockPaperScissors;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public enum Symbols {P, R, S,}
    public void wartoscznakow () {

    }


    public static void main(String[] args) {

        System.out.println("Podaj znak");
        Scanner sc = new Scanner(System.in);
        String znak = sc.next();
        Symbols symbolUzytkownika;

        if (znak.equals("p")){
            symbolUzytkownika = Symbols.P;
        }
        else if (znak.equals("r")){
            symbolUzytkownika = Symbols.R;}
            else {
            symbolUzytkownika = Symbols.S;
        }
            float wartosc = 0;
            String wartoscKomputera = "";
            Random random = new Random();
            wartosc = random.nextFloat();
            if (wartosc <= 0.33 ){
                wartoscKomputera = "P";
            }
            if (wartosc>0.33 && wartosc<=0.66){
                wartoscKomputera = "R";
            }
            if (wartosc>0.66){
                wartoscKomputera = "S";
            }

        int licznikUzytkownika=0;
        int licznikKomputera=0;
        while (sc.nextLine()!= "q") {
            if (symbolUzytkownika.equals(wartoscKomputera))
                System.out.println("It's a tie");

            if (symbolUzytkownika.equals(Symbols.S) && wartoscKomputera.equals("P")) {
                licznikUzytkownika++;
                System.out.println("Wygrywa uzytkownik");

            }else
                licznikKomputera++;

                System.out.println("wygrywa komputer");
            if (symbolUzytkownika.equals(Symbols.S) && wartoscKomputera.equals("R")) {
                licznikKomputera++;
                System.out.println("Wygrywa uzytkownik");

            }else
                licznikUzytkownika++;
            System.out.println("wygrywa komputer");

        }
        System.out.println("komputer" + licznikKomputera + "licznik uzykownika" + licznikUzytkownika);

    }
}