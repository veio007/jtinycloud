package com.jtinycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jtinycloud.api.**"})
@ComponentScan(basePackages = {"com.jtinycloud.api", "com.jtinycloud.controller"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
