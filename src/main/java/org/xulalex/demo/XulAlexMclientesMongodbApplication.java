package org.xulalex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XulAlexMclientesMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(XulAlexMclientesMongodbApplication.class, args);
    }

}
