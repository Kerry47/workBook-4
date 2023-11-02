package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {
    @Test
    public void dealershipTest(){
        Dealership dealership = new Dealership("name", "2212 something something", "311");
        System.out.println("Another great test by Kerry!!");
        assertEquals("name", dealership.getName());
        assertEquals("2212 something something", dealership.getAddress());
        assertEquals("311", dealership.getPhone());
    }
    @Test
    public void addVehicle(){
        Vehicle ibraPrius = new Vehicle(69, 2002, "Batman", "The bat mobile", "Omar", "Annie", 20202020, 1.5);
        Dealership dealership = new Dealership("name", "2212 something something", "311");
        assertEquals(0,dealership.getInventory().size());
        dealership.addVehicle(ibraPrius);
        assertEquals(1,dealership.getInventory().size());
    }

    @Test
    void getVehiclesByMakeModel() {

    }
}