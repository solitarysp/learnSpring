package com.higgsup.ApplicationContext.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
@Component
public class EvenPublisherBean2 {
    @Autowired
    ApplicationEventPublisher publisher;

    public void sendMsg(String msg) {
        publisher.publishEvent("gắn tin nhắn: "+msg);
    }
}
