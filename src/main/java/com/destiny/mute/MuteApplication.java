package com.destiny.mute;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.destiny.mute.module.*.dao")
public class MuteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuteApplication.class, args);
    }

}
