package com.ondisore.servicea.processors;

import com.ondisore.servicea.bean.LogProcessorBean;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogProcessor implements Processor {
    Logger logger= LoggerFactory.getLogger(LogProcessorBean.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("Logger: {}", exchange.getMessage().getBody());
    }
}
