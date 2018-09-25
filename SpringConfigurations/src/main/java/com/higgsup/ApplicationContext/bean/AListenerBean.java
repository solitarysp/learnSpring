package com.higgsup.ApplicationContext.bean;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AListenerBean {
    @EventListener
    public void onMyEvent(String msg) {
        System.out.println("event received: " + msg);
    }
}
