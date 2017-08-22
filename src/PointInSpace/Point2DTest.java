package PointInSpace;


import org.junit.Assert;
import org.junit.Test;

public class Point2DTest {

//test konstruktorów Point2D

    @Test
    public void point2DGetX() {
        Point2D point = new Point2D();
        Assert.assertEquals(0.0, point.getX(), 0.1);
    }
    @Test
    public void point2DGetY() {
        Point2D point = new Point2D();
        Assert.assertEquals(0.0, point.getY(), 0.1);
    }
    @Test
    public void point2DGetXWithXAmount2(){
        Point2D point = new Point2D(2.0f, 0.0f);
        Assert.assertEquals(2.0f, point.getX(), 0.1);
    }
    @Test
    public void point2DGetYWithYAmount3(){
        Point2D point = new Point2D(0.0f, 3.0f);
        Assert.assertEquals(3.0f, point.getY(), 0.1);
    }
    @Test
    public void point2DGetXYWithXAmount3AndYAmount4() {
        Point2D point = new Point2D(3.0f, 4.0f);
        Assert.assertArrayEquals(new float[] {3.0f,4.0f},point.getXY(),0.1f);
    }

}
