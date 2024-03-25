package com.yxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *自我保护模式
 * Eureka erver 在运行期间会去统计心跳失败比例在 15 分钟之内是否低于 85%，如果低于 85%，
 * Eureka erver 会将这些实例保护起来，
 * 让这些实例不会过期，同时提示一个警告。这种算法叫做 Eureka Server 的自我保护模式
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekkaServer2App
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekkaServer2App.class, args);
    }
}
