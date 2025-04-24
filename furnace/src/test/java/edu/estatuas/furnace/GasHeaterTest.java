package edu.estatuas.furnace;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class GasHeaterTest {


    private static RoomTemperature roomTemperature;

    @BeforeClass
    public static void setUpClass() {
        roomTemperature = roomTemperature.getInstance();
    }


    @Test
    public void singletonTest() {
    assertEquals(roomTemperature, roomTemperature.getInstance());

    }

    @Test
    public void roomTemperatureTest() {
        roomTemperature.heatRoom(200);
        assertEquals(200, roomTemperature.getTemperature(), 0.001);
        roomTemperature.heatRoom(-400);
        assertEquals(-400, roomTemperature.getTemperature(), 0.001);
    }
    @Test
    public void heatTemperatureTest() {
        GasHeater heater = new GasHeater();
        heater.engage(roomTemperature);
        assertEquals(1,roomTemperature.getTemperature(), 0.001);
    }
}
