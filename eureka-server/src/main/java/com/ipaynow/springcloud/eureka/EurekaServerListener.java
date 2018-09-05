package com.ipaynow.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: basic_euraka_server
 * @description: ${description}
 * @author: benyamin
 * @create: 2018-09-03 15:24
 **/
@Component
@Slf4j
public class EurekaServerListener {
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info("服务: {}, 应用名称: {} 下线", event.getServerId(), event.getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        log.info("实例id: {}，应用名称: {} 注册", event.getInstanceInfo().getInstanceId(), event.getInstanceInfo().getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        log.info("服务: {}, 应用名称: {} 续约", event.getServerId(), event.getAppName());
    }
//	@EventListener
//	public void listen(EurekaRegistryAvailableEvent event) {
//		System.err.println("注册中心 启动");
//	}
//	@EventListener
//	public void listen(EurekaServerStartedEvent event) {
//		System.err.println("Eureka Server 启动");
//	}
}
