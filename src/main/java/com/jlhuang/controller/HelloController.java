package com.jlhuang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello3")
    public String handleHelloWorld() {
        log.info("log test");
        return "hello, spring boot 2";
    }
}
