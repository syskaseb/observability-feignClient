package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("blocking-api")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}