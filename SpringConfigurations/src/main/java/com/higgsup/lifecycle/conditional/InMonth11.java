package com.higgsup.lifecycle.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;


public class InMonth11 implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        LocalDate localDate = LocalDate.now();
        if (localDate.getMonth().getValue() == 11) {
            return true;
        }
        return false;
    }
}
