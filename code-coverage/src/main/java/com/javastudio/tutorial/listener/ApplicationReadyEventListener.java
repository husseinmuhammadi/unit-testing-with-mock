package com.javastudio.tutorial.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationReadyEventListener {

    private Logger logger = LoggerFactory.getLogger(ApplicationReadyEventListener.class);

    public void onApplicationEvent() {
        logger.info("Application ready event listener");
    }
}
