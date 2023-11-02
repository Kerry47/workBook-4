package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {
    @Test
    public void dealerShipFile(){
         DealershipFileManager dfm = new DealershipFileManager();
         Dealership dealership = dfm.getDealership();
         assertEquals("D & B Used Cars", dealership.getName());
         assertEquals("111 Old Benbrook Rd", dealership.getAddress());
         assertEquals("817-555-5555", dealership.getPhone());
    }

}