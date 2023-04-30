package com.xuxian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuxian.mapper")
public class XXBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(XXBlogApplication.class);
    }

}
