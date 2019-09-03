package com.lethanh98.bean.fullandliteBeanModel.fullmodel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * author lethanh9398 <p>
 * create Date 30-08-2019 15:19  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@Configuration
public class FullBeanModel {
    @Bean
    public FullObject1 beanObject() {
        beanObject2();
        return new FullObject1();
    }

    @Bean
    public FullObject2 beanObject2() {
        System.out.println("new bean FullObject2 \n\n\n\n\n\n\n\n\n\n");
        return new FullObject2();
    }
}
