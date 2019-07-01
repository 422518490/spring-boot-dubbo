package com.consumer.service.impl;

import com.service.UserService;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/24
 * @description
 */
public class ConsumerUserServiceMock implements UserService {
    @Override
    public String sayHello(String name) {
        return "容错处理";
    }
}
