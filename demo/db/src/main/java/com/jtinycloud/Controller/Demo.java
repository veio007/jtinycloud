package com.jtinycloud.Controller;

import com.jtinycloud.api.DemoApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo implements DemoApi {

    @Override
    public String demo() {
        return "demo";
    }
}
