package com.ondisore.servicea.routes;

import com.ondisore.servicea.bean.CurrentTime;
import com.ondisore.servicea.bean.LogProcessorBean;
import com.ondisore.servicea.processors.LogProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MyRoute extends RouteBuilder {
    @Autowired
    private CurrentTime currentTime;
    @Autowired
    private LogProcessorBean logProcessor;

    @Override
    public void configure() throws Exception {
        String body = "${body}";
        from("timer:first-timer")
                .log(body)
                .transform().constant("Test message")
                .log(body)
//                .bean("currentTime")
                .bean(currentTime)
                .bean(logProcessor)
                .log(body)
                .process(new LogProcessor())
                .to("log:first-timer");
    }
}

