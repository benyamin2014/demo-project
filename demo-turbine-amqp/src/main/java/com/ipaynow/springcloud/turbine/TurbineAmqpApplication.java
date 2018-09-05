package com.ipaynow.springcloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @program: demo-project
 * @description: ${description}
 * @author: benyamin
 * @create: 2018-08-27 14:14
 **/
@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineAmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineAmqpApplication.class, args);
    }

//    @Bean
//    public ConfigurableCompositeMessageConverter integrationArgumentResolverMessageConverter(CompositeMessageConverterFactory factory) {
//        return new ConfigurableCompositeMessageConverter(factory.getMessageConverterForAllRegistered().getConverters());
//    }
}
