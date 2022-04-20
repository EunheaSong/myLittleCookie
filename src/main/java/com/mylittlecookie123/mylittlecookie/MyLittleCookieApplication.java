package com.mylittlecookie123.mylittlecookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class MyLittleCookieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLittleCookieApplication.class, args);
    }

}
