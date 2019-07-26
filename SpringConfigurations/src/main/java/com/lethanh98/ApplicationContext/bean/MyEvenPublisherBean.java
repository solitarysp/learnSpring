package com.lethanh98.ApplicationContext.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEvenPublisherBean {
    @Autowired
    ApplicationEventPublisher publisher;

    public void sendMsg(String msg) {
        publisher.publishEvent(msg);
    }
}
