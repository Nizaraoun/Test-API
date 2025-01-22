package io.glide.test_project_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "io.glide.test_project_api.model")
public class TestProjectApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestProjectApiApplication.class, args);
    }
}