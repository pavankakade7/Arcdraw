package com.arcdraw.ShapeComponent.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.classic.Logger;
@Controller
public class MyController<logger> {
         private static final Logger logger = (Logger) LoggerFactory.getLogger(MyController.class);

    @GetMapping("/example")
    public String example() {
        logger.info("This is an info message.");
        logger.error("This is an error message.");
        return "example";
    }
}
