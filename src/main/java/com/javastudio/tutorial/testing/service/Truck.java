package com.javastudio.tutorial.testing.service;

import com.javastudio.tutorial.testing.api.Engine;
import com.javastudio.tutorial.testing.api.Vehicle;

public class Truck implements Vehicle {

    private final Engine engine;

    Truck(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public boolean isStart() {
        return engine.isStart();
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }
}
