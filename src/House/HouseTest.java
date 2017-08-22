package House;

import org.junit.Assert;
import org.junit.Test;

public class HouseTest {

    @Test
    public void houseDefaultGetNumberGetStreetGetCityAndPostalCode() {
        House house = new House("12","Wolna","Wola","22-223");
        Assert.assertEquals("12", house.getNumber());
        Assert.assertEquals("Wolna", house.getStreet());
        Assert.assertEquals("Wola , 22-223", house.getCityAndPostalCode());
        Assert.assertEquals(1, house.getFloors());
    }
    @Test
    public void houseDefaultGetNumberGetStreetGetCityAndPostalCodeGetFloors() {
        House house = new House("15","Hoza","Stare", "34-589", 4);
        Assert.assertEquals("15", house.getNumber());
        Assert.assertEquals("Hoza", house.getStreet());
        Assert.assertEquals("Stare , 34-589", house.getCityAndPostalCode());
        Assert.assertEquals(4, house.getFloors());
    }
    @Test
    public void houseDefaultSetStreetTest(){
        House house = new House("12","Wolna","Wola","22-223");
        house.setStreet("Zajeta");
        Assert.assertEquals("Zajeta", house.getStreet());
    }
    @Test
    public void houseDefaultSetCityAndPostalCodeTest() {
        House house = new House("12","Wolna","Wola","22-223");
        house.setCityAndPostalCode("Baku", "34-255");
        Assert.assertEquals("Baku , 34-255",house.getCityAndPostalCode());
    }
    @Test
    public void houseDefaultSetFloorsTest() {
        House house = new House("12","Wolna","Wola","22-223");
        house.setFloors(233);
        Assert.assertEquals(233, house.getFloors());
        House house2 = new House("15","Hoza","Stare", "34-589", 4);
        house2.setFloors(23);
        Assert.assertEquals(23, house2.getFloors());
    }


}
