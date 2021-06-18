package com.example.server;

import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.MessageMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * @author cui
 */
@Log4j2
public class KeeperHandler {
    @MessageMapping("client-status")
    public Flux<String> statusUpdate(String status) {
        log.info("Connection {}", status);
        return Flux.interval(Duration.ofSeconds(5)).map(index -> String.valueOf(Runtime.getRuntime().freeMemory()));
    }
}
