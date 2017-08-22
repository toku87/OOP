package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

public class CircleAndCylinderTest {

    //Testowanie metod domyślnego konstruktora koła
    @Test
    public void circleDefaultGetRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultSetRadiusTest(){
        Circle circle = new Circle();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultGetColorTest(){
        Circle circle = new Circle();
        Assert.assertEquals("red", circle.getColor());
    }

    @Test
    public void circleDefaultSetColorTest(){
        Circle circle = new Circle();
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleDefaultAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }

    public void circleRadiusStingTest(){
        Circle circle = new Circle();
        Assert.assertEquals("Circle[radius=1,000000,color=red]", circle.toString());
    }

    //Testowanie konstruktora z argumentem promień koła
    @Test
    public void circleRadius2GetRadiusTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2SetRadiusTest(){
        Circle circle = new Circle(2.0);
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2GetColorTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("red", circle.getColor());
    }

    @Test
    public void circleRadius2SetColorTest(){
        Circle circle = new Circle(2.0);
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleRadius2GetAreaTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius2StingTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius=2,000000,color=red]", circle.toString());
    }

    //Testowanie konstruktora z argumentem promień i kolor koła
    @Test
    public void circleRadius3ColorGreenGetRadiusTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius3ColorGreenSetRadiusTest(){
        Circle circle = new Circle(3.0, "green");
        circle.setRadius(4.0);
        Assert.assertEquals(4.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius3ColorGreenGetColorTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals("green", circle.getColor());
    }
    @Test
    public void circleRadius3ColorGreenSetColorTest(){
        Circle circle = new Circle(3.0, "green");
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleRadius3ColorGreenGetAreaTest(){
        Circle circle = new Circle(3.0);
        Assert.assertEquals(28.27, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius3ColorGreenStingTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals("Circle[radius=3,000000,color=green]", circle.toString());
    }

    //test konstruktorów cylindra

    @Test
    public void cylinderGetHeightTest () {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(), 0.1);
    }

    @Test
    public void cylinderGetHeightAndGetColorTest () {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(), 0.1);
        Assert.assertEquals("red", cylinder.getColor());
    }

    @Test
    public void cylinderGetHeightAmount10Test(){
        Cylinder cylinder = new Cylinder(1,10);
        Assert.assertEquals(10, cylinder.getHeight(),0.1);
    }

    @Test
    public void cylinderGetHeightAmount15AndColorBlueTest(){
        Cylinder cylinder = new Cylinder(2,15,"blue");
        Assert.assertEquals(15, cylinder.getHeight(),0.1);
        Assert.assertEquals("blue", cylinder.getColor());
    }

    @Test
    public void cylinderSetHeightTest() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3.5);
        Assert.assertEquals(3.5, cylinder.getHeight(),0.1);
    }

    @Test
    public void cylinderGetVolumeTest () {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(3.14, cylinder.getVolume(),0.1);
    }

    @Test
    public void cylinderGetVolumeWithRadiusAmount3Test () {
        Cylinder cylinder = new Cylinder(3);
        Assert.assertEquals(28.27, cylinder.getVolume(), 0.1);
    }

    @Test
    public void cylinderGetVolumeWithHeigtAmount3Test () {
        Cylinder cylinder = new Cylinder(1,3);
        cylinder.getVolume();
        Assert.assertEquals(1.0, cylinder.getRadius(),0.1);
        Assert.assertEquals(9.42, cylinder.getVolume(), 0.1);
    }

    @Test
    public void cylinderGetVolumeWithHeigtAmount3AndColorBlackTest () {
        Cylinder cylinder = new Cylinder(1,3,"black");
        Assert.assertEquals(9.42, cylinder.getVolume(), 0.1);
        Assert.assertEquals("black", cylinder.getColor());
    }

    @Test
    public void cylinderSetColorToYellowTest(){
        Cylinder cylinder= new Cylinder();
        cylinder.setColor("yellow");
        Assert.assertEquals("yellow", cylinder.getColor());
    }
}
