package com.provider;


import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/6
 * @description
 */
@SpringBootApplication(exclude = DubboAutoConfiguration.class)
// 不能控制到方法级，这里使用xml方式
@ImportResource(value = {"classpath:dubbo/provider-dubbo.xml"})
public class ProviderApp {

    public static void main(String [] args){
        SpringApplication.run(ProviderApp.class,args);
    }
}
