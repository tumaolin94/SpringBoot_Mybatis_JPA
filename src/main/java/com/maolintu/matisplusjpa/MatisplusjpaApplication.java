package com.maolintu.matisplusjpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.maolintu.matisplusjpa.mapper")
public class MatisplusjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatisplusjpaApplication.class, args);
    }
}
