package com.jtinycloud.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("dbservice")
public interface DemoApi {

    @RequestMapping(value = "/demo", method = {RequestMethod.GET})
    public String demo();
}
