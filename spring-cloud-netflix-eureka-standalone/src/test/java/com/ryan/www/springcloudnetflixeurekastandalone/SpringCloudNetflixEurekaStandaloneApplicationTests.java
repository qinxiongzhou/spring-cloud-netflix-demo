package com.ryan.www.springcloudnetflixeurekastandalone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudNetflixEurekaStandaloneApplication.class, webEnvironment = RANDOM_PORT, properties = {
        "spring.jmx.enabled=true", "management.security.enabled=false",
        "management.endpoints.web.exposure.include=*","server.port=9000" })
public class SpringCloudNetflixEurekaStandaloneApplicationTests {


    @LocalServerPort
    private Integer port;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testDemoController(){
        @SuppressWarnings("rawtypes")
        ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
                "http://localhost:" + this.port + "/hello", String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}


