package com.consumer.service.impl;


import com.consumer.service.ConsumerUserService;
import com.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/18
 * @description
 */
@Service(value = "consumerUserService")
public class ConsumerUserServiceImpl implements ConsumerUserService {

    /**
     * 使用xml方式不能往注册中心注册信息，xml需要配合使用这种方式
     * group: 服务端一个接口有多个的实现类时，需要配置分组来调用
     * check: 是否需要启动时检查用于服务端未启动时
     * retries: 调用失败时的重试次数
     * cluster: 集群容错配置，默认是failover
     * url: 表示不使用注册中心，直接连接服务端
     * version: 当前服务调用的版本
     * cache: 用于结果缓存
     * generic: 表示用于泛化，具体参考官网例子
     * mock: 容错处理,true--有mock实现则调用，false--不去调用mock，还可以直接调用mock实现类
     * actives: 线程并发的调用数量，一般与负载均衡的leastactive一起使用
     * loadbalance: 负载均衡
     * connections: 客户端连接服务器的数量
     * lazy: 延迟连接用于减少长连接数。当有调用发起时，再创建长连接
     * sticky: 粘滞连接用于有状态服务，尽可能让客户端总是向同一提供者发起调用，除非该提供者挂了，再连另一台。
                粘滞连接将自动开启延迟连接，以减少长连接数。
     */
    @Reference(group = "user"
            , check = false
            //,retries = 3
            //,cluster = "failsafe"
            //,timeout = 100
            //,url = "dubbo://localhost:20880"
            , version = "1.0.0"
            //, cache = "lru"
            //,generic = true
            //,mock = "com.consumer.service.impl.ConsumerUserServiceMock"
            /*,actives = 8
            ,loadbalance = "leastactive"
            ,connections = 8*/
            //,lazy = true
            ,sticky = true
    )
    // xml配置文件时使用
    //@Resource(name = "userService")
    private UserService userService;

    @Override
    public String sayHello(String name) {
        System.out.println(name);
        // 隐式传参，后面的远程调用都会隐式将这些参数发送到服务器端，类似cookie，用于框架集成，不建议常规业务使用
        RpcContext.getContext().setAttachment("come","baby");
        String h = userService.sayHello(name);
        /*boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
        System.out.println("是否是客户端:" + isConsumerSide);*/
        return h;
    }

}
