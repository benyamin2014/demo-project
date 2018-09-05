package com.ipaynow.springcloud.service.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/db/url")
    @HystrixCommand
    @Cacheable(cacheNames="app_biz_center1",key = "'controller:abc:'.concat(#test)" )
    public String getDatasourceUrl(String test) {
        return environment.getProperty("spring.datasource.url");
    }

    @GetMapping(value = "/db/url1")
    @HystrixCommand
    @Cacheable(cacheNames="app_biz_center",key = "'controller:abc2:'.concat(#test)")
    public String getDatasourceUrl2(String test) {
        return environment.getProperty("spring.datasource.url");
    }

}
