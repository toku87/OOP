package House;

import org.junit.Assert;
import org.junit.Test;

public class HouseTest {

    @Test
    public void houseDefaultGetNumberGetStreetGetCityAndPostalCode() {
        House house = new House("12","Wolna","Wola","22-223");
        Assert.assertEquals("12", house.getNumber());
    }


}
