package MyTime;


public class Main {

    public static void main(String[] args) {
//     MyTime myTime = new MyTime();
//        myTime.setTime(23,59,59);
//        myTime.nextSecond();
//        myTime.previousSecond();
//        System.out.println(myTime);
//        MyTime myTime2 = new MyTime();
//        System.out.println(myTime2);
//        myTime2.previousSecond();
//        System.out.println(myTime2);
        MyTime myTime3 = new MyTime();
        myTime3.previousHour();
        System.out.println(myTime3);
        myTime3.previousMinute();
        System.out.println(myTime3);
        myTime3.nextSecond();
        System.out.println(myTime3);

    }
}
