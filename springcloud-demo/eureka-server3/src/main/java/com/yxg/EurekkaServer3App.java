package com.yxg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekkaServer3App
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekkaServer3App.class, args);
    }
}
