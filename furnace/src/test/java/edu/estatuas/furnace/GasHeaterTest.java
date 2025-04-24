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
}
