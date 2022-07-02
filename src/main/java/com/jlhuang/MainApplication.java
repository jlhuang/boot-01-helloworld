package com.jlhuang;

import com.jlhuang.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
       var run = SpringApplication.run(MainApplication.class, args);
        for(var i : run.getBeanDefinitionNames()) {
            System.out.println(i);
        }
        var myself = new User("Julian", 18);
        System.out.println(myself);

    }
}
