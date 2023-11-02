package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void VehicleConstructorTest(){
        Vehicle ibraPrius = new Vehicle(69, 2002, "Batman", "The bat mobile", "Omar", "Annie", 20202020, 1.5);
        Dealership dealership = new Dealership("name", "2212 something something", "311");
        System.out.println("Were doing something with testing");
        assertEquals(69, ibraPrius.getVin());
        assertEquals(2002, ibraPrius.getYear());
        assertEquals("Batman", ibraPrius.getMake());
        assertEquals("The bat mobile", ibraPrius.getModel());
        assertEquals("Omar", ibraPrius.getVehicleType());
        assertEquals("Annie", ibraPrius.getColor());

    }


}