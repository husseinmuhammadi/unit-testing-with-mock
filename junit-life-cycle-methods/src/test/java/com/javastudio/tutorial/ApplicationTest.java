package com.javastudio.tutorial;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationTest.class);
    private Properties properties = new Properties();

    @BeforeEach
    void setUp() {
        try (InputStream resource = ApplicationTest.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(resource);
        } catch (IOException e) {
            logger.warn("Error loading application properties", e);
        }
    }

    @Test
    void whenReadApplicationProperties_thenItShouldContainApplicationName() {
        properties.forEach((key, value) -> logger.info("{}: {}", key, value));
        assertNotNull(properties.getProperty("java.application.name"));
    }
}