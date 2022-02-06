package com.javastudio.tutorial;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApplicationTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    public ApplicationTest() {
        logger.info("ApplicationTest instantiated!");
    }

    @Test
    @DisplayName("This is the first test")
    void test1() {

    }

    @Test
    @DisplayName("This is the second test")
    void test2() {

    }

    @Test
    @Disabled("This test will not execute!")
    void disabledTest() {
        Assert.fail();
    }
}