package com.javastudio.tutorial.cfg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {

    @Test
    void shouldHaveAppNameInProperties() {
        String appName = Configuration.getProperty("java.application.name");
        assertNotNull(appName);
    }
}