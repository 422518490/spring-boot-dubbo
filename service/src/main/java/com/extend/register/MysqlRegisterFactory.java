package com.extend.register;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.RegistryFactory;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/7/18
 * @description
 */
public class MysqlRegisterFactory implements RegistryFactory {
    @Override
    public Registry getRegistry(URL url) {
        return new MysqlRegister();
    }
}
