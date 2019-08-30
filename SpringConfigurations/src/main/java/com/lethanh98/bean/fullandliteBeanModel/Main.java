package com.lethanh98.bean.fullandliteBeanModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * author lethanh9398 <p>
 * create Date 30-08-2019 15:14  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@ComponentScan("com.lethanh98.bean.fullandliteBeanModel.fullmodel.")
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
    }
}
