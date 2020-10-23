package com.jk.service.hystrix;



import com.jk.service.UserService;
import org.springframework.stereotype.Component;


@Component //将断容器注入到spring容器中
public class UserServiceHystrix implements UserService{


    @Override
    public String show() {
        return "网络不好，请重试";
    }
}
