package com.yxg;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ServiceConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceConsumerApp.class, args);
    }

    @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }
}
