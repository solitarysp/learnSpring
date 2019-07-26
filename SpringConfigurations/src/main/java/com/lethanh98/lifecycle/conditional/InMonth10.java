package com.lethanh98.lifecycle.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;


public class InMonth10 implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        LocalDate localDate = LocalDate.now();
        if (localDate.getMonth().getValue() == 10) {
            return true;
        }
        return false;
    }
}
