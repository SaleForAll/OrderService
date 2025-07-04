package com.orderService.openFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.orderService.model.User;


// @FeignClient(name = "USER-SERVICE", url = "http://user-services-esbgd7cvduebe4gx.canadacentral-01.azurewebsites.net/api/users")
@FeignClient(name = "USER-SERVICE", url = "http://localhost:2224/api/users")
public interface UserClient {

    @GetMapping("/{userId}")
    public User getUserDetailbyUserID(@PathVariable Long userId);

}