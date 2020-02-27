package com.ltl.opencartadminstrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ltl.opencartadminstrationback.dao")
public class OpenCartAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenCartAdministrationBackApplication.class, args);
    }

}
