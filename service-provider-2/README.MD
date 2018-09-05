## BUS 使用(1.x 与 2.x 区别)
* http://localhost:8888/actuator/bus-refresh
* 安全错略配置
```$xslt
management:
  endpoints:
    web:
      exposure:
        include: bus-refresh,hystrix.stream
```

## hystrix rabbit
```$xslt
  <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>
        <!--依赖名称注意-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-netflix-hystrix-stream</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
        </dependency>
```