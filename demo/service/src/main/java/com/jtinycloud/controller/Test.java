package com.jtinycloud.controller;

import com.jtinycloud.api.DemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test imp {
    @Autowired
    private DemoApi demoApi;

    @RequestMapping(value = "/test", method={RequestMethod.GET})
    public String test() {
        return demoApi.demo();
    }
}
