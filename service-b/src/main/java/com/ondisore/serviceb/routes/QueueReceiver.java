package com.ondisore.serviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:queue1")
                .log("log:received-message: ${body}");
    }
}
