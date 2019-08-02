package com.ryan.www.springcloudnetflixeurekapeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudNetflixEurekaPeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNetflixEurekaPeerApplication.class, args);
    }

}
