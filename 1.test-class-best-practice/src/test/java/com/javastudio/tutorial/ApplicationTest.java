package com.javastudio.tutorial;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApplicationTest {

    private Logger logger= LoggerFactory.getLogger(ApplicationTest.class);

    public ApplicationTest() {
        logger.info("ApplicationTest instantiated!");
    }

    @Test
    void test1() {

    }

    @Test
    void test2() {

    }
}