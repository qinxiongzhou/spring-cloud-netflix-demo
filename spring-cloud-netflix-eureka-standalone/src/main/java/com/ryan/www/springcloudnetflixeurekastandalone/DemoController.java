package com.ryan.www.springcloudnetflixeurekastandalone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("hello")
    public String hello(){
        System.out.println("call hello interface!");
        return "hello world！";
    }
}
