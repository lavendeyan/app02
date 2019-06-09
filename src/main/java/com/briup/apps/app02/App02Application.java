package com.briup.apps.app02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.briup.apps.app02.dao"})
@SpringBootApplication
public class App02Application {

    public static void main(String[] args) {

        SpringApplication.run(App02Application.class, args);
    }

}
