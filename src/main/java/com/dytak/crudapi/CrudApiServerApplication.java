package com.dytak.crudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class CrudApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApiServerApplication.class, args);
    }

}
