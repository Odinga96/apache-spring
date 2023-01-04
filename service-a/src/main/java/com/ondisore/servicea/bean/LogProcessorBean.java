package com.ondisore.servicea.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LogProcessorBean {
    Logger logger= LoggerFactory.getLogger(LogProcessorBean.class);

    public void process(String message){
        logger.info("Logger: {}", message);
    }
}
