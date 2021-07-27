package com.cos.blog3.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogApplicationTest {
    @GetMapping("/test/hello")
    public String hello(){
        String hello = "hello";
        return hello;
    }
}
