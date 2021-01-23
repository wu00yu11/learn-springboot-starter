package com.learn.self.main.controller;

import com.learn.self.start.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private User user;

    @GetMapping(value = "/hello")
    public User hello(){
        return user;
    }
}
