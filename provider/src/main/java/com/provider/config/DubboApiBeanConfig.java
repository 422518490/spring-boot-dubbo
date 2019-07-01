/*
package com.provider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/21
 * @description dubbo的api bean配置
 *//*

@Configuration
public class DubboApiBeanConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config = new ApplicationConfig();
        // dubbo应用名称
        config.setName("provider");
        return config;
    }


    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig config = new RegistryConfig();
        // 注册中心地址
        config.setAddress("127.0.0.1:2181");
        config.setProtocol("zookeeper");
        return config;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig config = new ProtocolConfig();
        // 协议名称
        config.setName("dubbo");
        // 协议端口号
        config.setPort(20880);
        return config;
    }
}
*/
