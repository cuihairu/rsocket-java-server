package com.example.cross.config;

import io.rsocket.core.RSocketServer;
import io.rsocket.core.Resume;
import org.springframework.boot.rsocket.server.RSocketServerCustomizer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author cui
 * 断线重连的检测配置
 */
@Profile("resumption")
@Component
public class ResumptionConfig implements RSocketServerCustomizer {
    @Override
    public void customize(RSocketServer rSocketServer) {
        rSocketServer.resume(new Resume());
    }
}
