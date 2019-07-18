package com.consumer.controller;

import com.consumer.service.ConsumerUserService;
/*import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.data.Stat;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/18
 * @description
 */
@RestController
public class UserController {

    @Resource
    private ConsumerUserService consumerUserService;

    @GetMapping(value = "/sayHello")
    public void sayHello(@RequestParam("name")String name){
        String sayHello = consumerUserService.sayHello(name);
        System.out.println(sayHello);
    }

    /*@DeleteMapping(value = "/removeDubbo")
    public void deletZk() throws Exception {
        RetryPolicy policy = new ExponentialBackoffRetry(1000,3);
        CuratorFramework client
                = CuratorFrameworkFactory.builder()
                .connectString("127.0.0.1:2181")
                .sessionTimeoutMs(5000)
                .connectionTimeoutMs(3000)
                .retryPolicy(policy)
                .build();
        client.start();
        String node = "/dubbo";
        Stat stat = client.checkExists().forPath(node);
        if (Optional.ofNullable(stat).isPresent()){
           client.delete().guaranteed().deletingChildrenIfNeeded().forPath(node);
        }
    }*/
}
