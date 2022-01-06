package com.example.springnativetutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringNativeTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeTutorialApplication.class, args);
    }


    @RestController
    class TestController {
        @GetMapping("/greeting")
        public String greeting(String name) {
            return "Hello " + name;
        }
    }
}
