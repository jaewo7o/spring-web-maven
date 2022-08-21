package com.jaewoo.demo.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TEST")
@RestController
public class TestController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello", notes = "Hello World")
    public String helloWorld() {
        return "hello";
    }
}
