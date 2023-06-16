package com.example.portalend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Portal2023endtermApplication {

    public static void main(String[] args) {
        PageController pageController = new PageController();
        SpringApplication.run(Portal2023endtermApplication.class, args);
    }

}
