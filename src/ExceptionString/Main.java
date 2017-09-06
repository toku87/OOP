package ExceptionString;


public class Main {
    public static void main(String[] args) {


        String[] strArr = new String[]{"jeden", "dwa", "trzy"};
        WordsInArray wia = new WordsInArray();

        try {
            wia.find(strArr, "piec");
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println("Spróbuj inny element");

        }
    }
}
