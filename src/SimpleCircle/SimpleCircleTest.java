package SimpleCircle;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCircleTest {
    //Testowanie metod domyślnego konstruktora
    @Test
    public void circleDefaultGetRadiusTest(){
        SimpleCircle sCircle = new SimpleCircle();
        Assert.assertEquals(1.0, sCircle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultSetRadiusTest(){
        SimpleCircle sCircle = new SimpleCircle();
        sCircle.setRadius(3.0);
        Assert.assertEquals(3.0, sCircle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultAreaTest(){
        SimpleCircle sCircle = new SimpleCircle();
        Assert.assertEquals(3.14, sCircle.getArea(), 0.01);
    }

    @Test
    public void circleDefaultCircumferenceTest(){
        SimpleCircle sCircle = new SimpleCircle();
        Assert.assertEquals(6.28, sCircle.getCircumference(), 0.01);
    }

    @Test
    public void circleRadiusStingTest(){
        SimpleCircle sCircle = new SimpleCircle();
        Assert.assertEquals("Circle[radius=1,000000]", sCircle.toString());
    }

    //Testowanie konstruktora z argumentem promień
    @Test
    public void circleRadius2GetRadiusTest(){
        SimpleCircle sCircle = new SimpleCircle(2.0);
        Assert.assertEquals(2.0, sCircle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2SetRadiusTest(){
        SimpleCircle sCircle = new SimpleCircle(2.0);
        sCircle.setRadius(3.0);
        Assert.assertEquals(3.0, sCircle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2GetAreaTest(){
        SimpleCircle sCircle = new SimpleCircle(2.0);
        Assert.assertEquals(12.56, sCircle.getArea(), 0.01);
    }

    @Test
    public void circleRadius2CircumferenceTest(){
        SimpleCircle sCircle = new SimpleCircle(2.0);
        Assert.assertEquals(12.57, sCircle.getCircumference(), 0.01);
    }

    @Test
    public void circleRadius2StingTest(){
        SimpleCircle sCircle = new SimpleCircle(2.0);
        Assert.assertEquals("Circle[radius=2,000000]", sCircle.toString());
    }
}
