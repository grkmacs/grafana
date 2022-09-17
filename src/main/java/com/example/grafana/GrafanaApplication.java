package com.example.grafana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GrafanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrafanaApplication.class, args);
    }

}
