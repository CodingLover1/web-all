package com.ws.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @GetMapping("hello")
    public String  test(){
        log.info("recive a request");
        return "hello world";
    }
}
