package com.javastudio.tutorial;

import com.javastudio.tutorial.extensions.LoggingExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;

@ExtendWith(LoggingExtension.class)
class ApplicationTest {

    private Logger logger;

    @Test
    void shouldWork() {
        Assertions.assertNotNull(logger);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}