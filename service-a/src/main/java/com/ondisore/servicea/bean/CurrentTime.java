package com.ondisore.servicea.bean;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CurrentTime {
    public String getTime() {
        return "Time is " + LocalDateTime.now();
    }
}
