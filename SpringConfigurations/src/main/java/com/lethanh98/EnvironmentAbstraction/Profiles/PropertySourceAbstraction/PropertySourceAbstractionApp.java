package com.lethanh98.EnvironmentAbstraction.Profiles.PropertySourceAbstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 19-11-2019 15:00  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class PropertySourceAbstractionApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericApplicationContext();
        Environment env = ctx.getEnvironment();
    }
}
