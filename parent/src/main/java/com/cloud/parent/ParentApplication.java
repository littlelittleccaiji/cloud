package com.cloud.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@EnableTransactionManagement
@EnableScheduling
@SpringBootApplication public class ParentApplication {

    public static void main(String[] args) {

        SpringApplication.run(ParentApplication.class, args);
    }

}
