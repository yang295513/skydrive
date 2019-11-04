package com.qs304.skydrive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkydriveApplication {

    public static void main(String[] args) {
        Logger logger=LoggerFactory.getLogger(SkydriveApplication.class);
        SpringApplication.run(SkydriveApplication.class, args);
        logger.info("我是一个info");
    }

}
