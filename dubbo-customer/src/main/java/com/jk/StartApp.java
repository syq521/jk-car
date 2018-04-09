package com.jk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-customer.xml")

@SpringBootApplication//加载spring环境 扫描(本包及子包)spring注解 读取app核心配置文件 

public class StartApp {

    public static void main(String[] args) throws Exception {
    	//springboot启动命令
        SpringApplication.run(StartApp.class, args);
    }
}
