package Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    //Testowanie metod domyślnego konstruktora
    @Test
    public void rectangleDefaultGetLengthGetWidthTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getLength(), 0.1);
        Assert.assertEquals(1.0, rectangle.getWidth(), 0.1);
    }

    @Test
    public void rectangleDefaultSetLengthTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(3.0f);
        Assert.assertEquals(3.0f, rectangle.getLength(), 0.1);
    }

    @Test
    public void rectangleDefaultSetWidthTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3.0f);
        Assert.assertEquals(3.0f, rectangle.getWidth(), 0.1);
    }

    @Test
    public void rectangleDefaultGetAreaTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.00000, rectangle.getArea(), 0.1);
    }

    @Test
    public void rectangleDefaultGetPerimeterTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(4.00000, rectangle.getPerimeter(), 0.1);
    }

    @Test
    public void rectangleDefaultStingTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals("Rectangle[length=1,000000,width=1,000000]", rectangle.toString());
    }

    //Testowanie konstruktora z podaną długością i szerokością
    @Test
    public void rectangleLength2Width3GetLengthGetWidthTest(){
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals(2.0, rectangle.getLength(), 0.1);
        Assert.assertEquals(3.0, rectangle.getWidth(), 0.1);
    }

    @Test
    public void rectangleLength2Width3DefaultSetLengthTest(){
        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setLength(8.0f);
        Assert.assertEquals(8.0f, rectangle.getLength(), 0.1);
    }

    @Test
    public void rectangleLength2Width3SetWidthTest(){
        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setWidth(9.0f);
        Assert.assertEquals(9.0f, rectangle.getWidth(), 0.1);
    }

    @Test
    public void rectangleLength2Width3GetAreaTest(){
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(6.00000, rectangle.getArea(), 0.1);
    }

    @Test
    public void rectangleLength2Width3GetPerimeterTest(){
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(10.00000, rectangle.getPerimeter(), 0.1);
    }

    @Test
    public void rectangleLength2Width3StingTest(){
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals("Rectangle[length=2,000000,width=3,000000]", rectangle.toString());
    }
}
