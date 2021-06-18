package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cui
 */
//@SpringBootApplication(exclude = {ReactiveUserDetailsServiceAutoConfiguration.class, SecurityAutoConfiguration.class, ReactiveSecurityAutoConfiguration.class, RSocketSecurityAutoConfiguration.class})
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
