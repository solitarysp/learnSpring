package com.lethanh98.bean.customScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CustomImpl implements Scope {
    CustomThreadLocal customThreadLocal = new CustomThreadLocal();

    @Override
    public Object get(String str, ObjectFactory<?> objectFactory) {
        Map<String, Object> scope = (Map<String, Object>) customThreadLocal.get();
        Object object = scope.get(str);
        if (object == null) {
            object = objectFactory.getObject();
            System.out.println("crfeate");
            scope.put(str, object);
        }
        return object;
    }

    @Override
    public Object remove(String str) {
        Map<String, Object> scope = (Map<String, Object>) customThreadLocal.get();
        Object object = scope.get(str);
        if (object != null) {
            scope.remove(str);
            return object;

        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

    class CustomThreadLocal extends ThreadLocal {
        protected Map<String, Object> initialValue() {
            System.out.println("initialize ThreadLocal");
            return new HashMap<String, Object>();
        }
    }
}
