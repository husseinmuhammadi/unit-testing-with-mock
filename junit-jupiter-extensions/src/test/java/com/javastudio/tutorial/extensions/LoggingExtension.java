package com.javastudio.tutorial.extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class LoggingExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        Logger logger = LoggerFactory.getLogger(testInstance.getClass());
        Method setter = testInstance.getClass()
                .getMethod("setLogger", Logger.class);
        setter.setAccessible(true);
        setter.invoke(testInstance, logger);
    }
}
