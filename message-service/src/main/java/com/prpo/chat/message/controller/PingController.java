package com.prpo.chat.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class PingController {
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("service", "message-service", "status", "ok");
    }
}
