package com.extend.register;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.NotifyListener;
import org.apache.dubbo.registry.Registry;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/7/18
 * @description
 */
@Slf4j
public class MysqlRegister implements Registry {

    private URL registryUrl;

    @Override
    public URL getUrl() {
        // 数据库的地址
        return registryUrl;
    }

    protected void setUrl(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("registry url == null");
        }
        this.registryUrl = url;
    }

    @Override
    public boolean isAvailable() {
        // 判断数据库是否连接
        return true;
    }

    @Override
    public void destroy() {
        log.info("消除数据库注册信息");
    }

    @Override
    public void register(URL url) {
        log.info("注册到数据库");
    }

    @Override
    public void unregister(URL url) {
        log.info("取消数据库注册");
    }

    @Override
    public void subscribe(URL url, NotifyListener listener) {
        log.info("订阅消息......");
    }

    @Override
    public void unsubscribe(URL url, NotifyListener listener) {
        log.info("取消消息订阅");
    }

    @Override
    public List<URL> lookup(URL url) {
        log.info("获取那些可以连接的地址");
        return null;
    }
}
