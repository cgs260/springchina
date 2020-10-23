package com.jk.service;


import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "string-provider", fallback = UserServiceHystrix.class)
public interface UserService {


    @RequestMapping("show")
    String show();


}
