package com.javastudio.tutorial.testing.service;

import com.javastudio.tutorial.testing.api.Engine;
import com.javastudio.tutorial.testing.stub.MercedesBenzEngine;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TruckTest {

    private Logger logger = Logger.getLogger(TruckTest.class.getName());

    @Test
    void truckStartingAndStoppingWithStubEngine() {
        logger.info("Testing truck starting and stopping");
        Truck truck = new Truck(new MercedesBenzEngine());
        truck.start();
        assertTrue(truck.isStart());
        truck.stop();
        assertFalse(truck.isStart());
    }

    @Test
    void truckStartingWithMockEngine() {
        logger.info("Testing truck starting");
        Engine mockEngine = mock(Engine.class);
        when(mockEngine.isStart()).thenReturn(true);
        Truck truck = new Truck(mockEngine);
        assertTrue(truck.isStart());
    }
}