package com.javastudio.tutorial;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("local")
class ApplicationLocalTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationLocalTest.class);

    @Test
    void loadContext() {
        logger.info("This test will run based on maven surefire plugin configuration");
    }
}