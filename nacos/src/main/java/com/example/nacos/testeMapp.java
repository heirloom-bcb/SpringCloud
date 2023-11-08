//package com.example.nacos;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @Description:
// * @ClassName: testeMapp
// * @Author: bochb
// * @Version: 1.0
// * @Date: 2023/11/3 15:48
// */
//@RestController
//@Slf4j
//public class testeMapp {
//
//    @Autowired
//    DiscoveryClient discoveryClient;
//
//    @GetMapping("/test")
//    public void get(){
//        //查询指定实例的所有信息
//        List<ServiceInstance> instances = discoveryClient.getInstances("spring-cloud-nacos");
//        log.info("=============注册nacos的实例信息是================{}",instances.toString());
//    }
//}
