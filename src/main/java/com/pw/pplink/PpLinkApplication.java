package com.pw.pplink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.pw.pplink.mapper")
public class PpLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpLinkApplication.class, args);
    }

}
