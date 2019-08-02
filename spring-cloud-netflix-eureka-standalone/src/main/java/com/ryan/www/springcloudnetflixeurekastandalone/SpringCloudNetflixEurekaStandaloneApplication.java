package com.ryan.www.springcloudnetflixeurekastandalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudNetflixEurekaStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNetflixEurekaStandaloneApplication.class, args);
    }

}
