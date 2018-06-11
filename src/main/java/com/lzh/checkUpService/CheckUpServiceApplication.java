package com.lzh.checkUpService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import com.lzh.common.annotation.MyBatisRepository;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.lzh.checkUpService.persistence", annotationClass = MyBatisRepository.class)
public class CheckUpServiceApplication {

    public static void main(String[] args) {
    	SpringApplication.run(CheckUpServiceApplication.class, args);
    }
}
