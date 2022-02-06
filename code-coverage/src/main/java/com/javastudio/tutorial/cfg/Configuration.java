package com.javastudio.tutorial.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class Configuration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);
    private static final Properties PROPERTIES = new Properties();


    static {
        try (InputStream stream = Configuration.class.getClassLoader().getResourceAsStream("application.properties")) {
            PROPERTIES.load(stream);
        } catch (IOException e) {
            LOGGER.warn("Error loading ");
        }
    }

    public static String getProperty(String key) {
        Objects.requireNonNull(key);
        return PROPERTIES.getProperty(key);
    }
}
