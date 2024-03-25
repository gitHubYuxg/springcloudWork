package com.yxg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceZuulApp.class, args);
    }
}
