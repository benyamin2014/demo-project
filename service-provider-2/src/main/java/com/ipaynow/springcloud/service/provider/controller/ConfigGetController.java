package com.ipaynow.springcloud.service.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo-project
 * @description: ${description}
 * @author: benyamin
 * @create: 2018-08-25 11:45
 **/
@RestController
public class ConfigGetController {

    @Autowired
    private Environment environment;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "trace")
    @HystrixCommand
    public ResponseEntity<String> trace() {
        return restTemplate.getForEntity("http://my-service-provider/db/url", String.class);
    }

}
