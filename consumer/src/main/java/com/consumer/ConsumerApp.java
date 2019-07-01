package com.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/12
 * @description
 */
@SpringBootApplication
//@ImportResource(value = {"classpath:dubbo/consumer-dubbo.xml"})
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
