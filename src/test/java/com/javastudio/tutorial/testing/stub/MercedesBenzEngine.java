package com.javastudio.tutorial.testing.stub;

import com.javastudio.tutorial.testing.api.Engine;

public class MercedesBenzEngine implements Engine {

    private boolean start;

    @Override
    public void start() {
        if (start == true)
            throw new IllegalStateException();
        start = true;
    }

    @Override
    public void stop() {
        start = false;
    }

    @Override
    public boolean isStart() {
        return start;
    }
}
