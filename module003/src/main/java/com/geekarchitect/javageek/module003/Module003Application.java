package com.geekarchitect.javageek.module003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module003Application {

    public static void main(String[] args) {
        SpringApplication.run(Module003Application.class, args);
    }
    public void demo(){
        int i=0;
        i++;
        ++i;
        System.out.println(i);
    }

}
