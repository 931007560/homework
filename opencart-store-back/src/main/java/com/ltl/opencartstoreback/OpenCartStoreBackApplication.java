package com.ltl.opencartstoreback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ltl.opencartadminstrationback.dao")
public class OpenCartStoreBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenCartStoreBackApplication.class, args);
    }

}
