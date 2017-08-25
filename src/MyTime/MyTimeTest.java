package MyTime;


import org.junit.Assert;
import org.junit.Test;


public class MyTimeTest {

    //TEST METOD KONSTRUKTORA DOMYŚLNEGO

    @Test
    public void myTimeDefaultValueGetHourGetMinuteGetSecondTest() {
        MyTime myTime = new MyTime();
        Assert.assertEquals(0,myTime.getHour());
        Assert.assertEquals(0,myTime.getMinute());
        Assert.assertEquals(0,myTime.getSecond());
    }
    @Test
    public void myTimeDefaultSetHourSetMinuteSetSecondMethodTest() {
        MyTime myTime = new MyTime();
        myTime.setHour(3);
        Assert.assertEquals(3,myTime.getHour());
        myTime.setMinute(58);
        Assert.assertEquals(58, myTime.getMinute());
        myTime.setSecond(45);
        Assert.assertEquals(45, myTime.getSecond());
    }
    @Test
    public void myTimeDefaultNextHourNextMinuteNextSecondMethodTest(){
        MyTime myTime = new MyTime();
        myTime.nextHour();
        myTime.nextMinute();
        myTime.nextSecond();
        Assert.assertEquals(1, myTime.getHour());
        Assert.assertEquals(1,myTime.getMinute());
        Assert.assertEquals(1,myTime.getSecond());
    }
    @Test
    public void myTimeDefaultPreviousHourPreviousMinutePreviousSecondMethodTest(){
        MyTime myTime = new MyTime();
        myTime.previousHour();
        Assert.assertEquals(23,myTime.getHour());
        MyTime myTime2 = new MyTime();
        myTime.previousMinute();
        Assert.assertEquals(59,myTime.getMinute());
        MyTime myTime3 = new MyTime();
        myTime.previousSecond();
        Assert.assertEquals(59,myTime.getSecond());
    }
    @Test
    public void myTimeDefaultSetTimeMethodTest() {
        MyTime myTime = new MyTime();
        myTime.setTime(22,44,54);
        Assert.assertEquals(22, myTime.getHour());
        Assert.assertEquals(44, myTime.getMinute());
        Assert.assertEquals(54, myTime.getSecond());
    }
    @Test
    public void myTimeDefaultToStringMethodTest() {
        MyTime myTime = new MyTime();
        Assert.assertEquals("00 : 00 : 00",myTime.toString());
    }

    //TEST KONSTRUKTORA Z PODANYMI ARGUMENTAMI GODZINA : MINUTA : SEKUNDA

    @Test
    public void myTime22Hour58Minute45SecondTest() {
        MyTime myTime = new MyTime(22,58,45);
        Assert.assertEquals(22, myTime.getHour());
        Assert.assertEquals(58, myTime.getMinute());
        Assert.assertEquals(45, myTime.getSecond());
    }
    @Test
    public void myTime22Hour58Minute45SecondSetHourTest() {
        MyTime myTime = new MyTime(22,58,45);
        myTime.setHour(12);
        Assert.assertEquals(12,myTime.getHour());
    }
    @Test
    public void myTime22Hour58Minute45SecondSetMinuteTest() {
        MyTime myTime = new MyTime(22,58,45);
        myTime.setMinute(59);
        Assert.assertEquals(59, myTime.getMinute());
    }
    @Test
    public void myTime22Hour58Minute45SecondSetSecondTest() {
        MyTime myTime = new MyTime(22,58,45);
        myTime.setSecond(3);
        Assert.assertEquals(3,myTime.getSecond());
    }
    @Test
    public void myTime23Hour00Minute00SecondNextHourMethodTest () {
        MyTime myTime = new MyTime(23,00,00);
        myTime.nextHour();
        Assert.assertEquals(0,myTime.getHour());
    }
    @Test
    public void myTime23Hour59Minute00SecondNextMinuteMethodTest () {
        MyTime myTime = new MyTime(23,59,0);
        myTime.nextMinute();
        Assert.assertEquals(0,myTime.getMinute());
    }
    @Test
    public void myTime23Hour59Minute59SecondNextSecondMethodTest () {
        MyTime myTime = new MyTime(23,59,59);
        myTime.nextSecond();
        Assert.assertEquals(0, myTime.getSecond());
    }
    @Test
    public void myTime00Hour00Minute00SecondPreviousHourMethodTest () {
        MyTime myTime = new MyTime(00,00,00);
        myTime.previousHour();
        Assert.assertEquals(23,myTime.getHour());
    }
    @Test
    public void myTime23Hour59Minute00SecondPreviousMinuteMethodTest () {
        MyTime myTime = new MyTime(23,59,0);
        myTime.previousMinute();
        Assert.assertEquals(58,myTime.getMinute());
    }
    @Test
    public void myTime23Hour59Minute00SecondPreviousSecondMethodTest () {
        MyTime myTime = new MyTime(23,59,0);
        myTime.previousSecond();
        Assert.assertEquals(59, myTime.getSecond());
    }
    @Test
    public void myTime23Hour59Minute00SecondSetTimeMethodTest() {
        MyTime myTime = new MyTime(23,59,0);
        myTime.setTime(11,11,11);
        Assert.assertEquals(11,myTime.getHour());
        Assert.assertEquals(11,myTime.getMinute());
        Assert.assertEquals(11,myTime.getSecond());
    }
    @Test
    public void myTime03Hour07Minute02SecondToStringMethodTest() {
        MyTime myTime = new MyTime(3,7,2);
        Assert.assertEquals("03 : 07 : 02", myTime.toString());
    }
}
