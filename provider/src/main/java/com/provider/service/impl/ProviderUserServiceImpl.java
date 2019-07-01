package com.provider.service.impl;

import com.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/18
 * @description
 */
/**
 * interfaceClass--接口的class
 * group--用于一个接口有多个的实现类时，需要配置分组来给消费者端调用
 */
@Service(interfaceClass = UserService.class,group = "provider")
@Component(value = "providerUserService")
public class ProviderUserServiceImpl implements UserService{

    @Override
    public String sayHello(String name) {
        return "come on " + name;
    }
}
