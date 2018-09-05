package com.ipaynow.springcloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @program: demo-project
 * @description: ${description}
 * @author: benyamin
 * @create: 2018-08-27 14:14
 **/
@SpringBootApplication
//@EnableTurbineStream
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

//    @Bean
//    public ConfigurableCompositeMessageConverter integrationArgumentResolverMessageConverter(CompositeMessageConverterFactory factory) {
//        return new ConfigurableCompositeMessageConverter(factory.getMessageConverterForAllRegistered().getConverters());
//    }
}
