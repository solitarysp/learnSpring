package com.lethanh98.bean.fullandliteBeanModel.lite;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * author lethanh9398 <p>
 * create Date 30-08-2019 15:14  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@Component
public class LiteBeanModel {
    @Bean
    public BeanObject beanObject() {
        beanObject2();
        return new BeanObject();
    }

    @Bean
    public BeanObject2 beanObject2() {
        System.out.println("new bean object2\n\n\n\n\n\n\n\n\n\n");
        return new BeanObject2();
    }
}
