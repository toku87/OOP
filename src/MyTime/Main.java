package MyTime;


public class Main {

    public static void main(String[] args) {
     MyTime myTime = new MyTime();
        myTime.setTime(23,59,59);
        myTime.nextSecond();
        myTime.previousSecond();
        System.out.println(myTime);
    }
}
