package com.provider.service.impl;


import com.annotation.SayHelloAnnotation;
import com.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/6
 * @description
 */

/**
 * 注解的方式不能控制到方法级，可以通过使用xml配置的方式来实现
 * interfaceClass--接口的class
 * group--用于一个接口有多个的实现类时，需要配置分组来给消费者端调用
 * retries--客户端调用失败时的重试次数,如果客户端没有提供重试次数，那么该参数生效
 * cluster--集群容错配置，默认是failover
 * loadbalance--负载均衡配置，默认是random
 * timeout--方法调用的响应时间
 */
@Service(interfaceClass = UserService.class
        ,group = "user"
        //,retries = 6
        //cluster = "failsafe",
        //loadbalance = "leastactive",
        //,timeout = 100
        ,version = "1.0.0"
)
@Component(value = "userService")
public class UserServiceImpl implements UserService {
    @SayHelloAnnotation
    @Override
    public String sayHello(String name) {
        System.out.println(name);
        // 本端是否为提供端，这里会返回true
        boolean isPrivoder = RpcContext.getContext().isProviderSide();
        System.out.println("是否为服务端" + isPrivoder);

        // 获取调用方IP地址
        String clientIp = RpcContext.getContext().getRemoteHost();
        System.out.println("访问的客户端地址为" + clientIp);

        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        System.out.println("服务配置信息" + application);

        // 获取隐式传参
        String come = RpcContext.getContext().getAttachment("come");
        System.out.println("获取隐式传参" + come);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello " + name;
    }
}
