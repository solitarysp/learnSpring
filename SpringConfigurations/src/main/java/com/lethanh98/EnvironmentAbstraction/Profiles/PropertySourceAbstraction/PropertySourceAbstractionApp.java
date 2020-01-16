package com.lethanh98.EnvironmentAbstraction.Profiles.PropertySourceAbstraction;

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
        GenericApplicationContext ctx = new GenericApplicationContext();
        checkProperTy(ctx);
    }

    private static void checkProperTy(GenericApplicationContext ctx) {
        Environment env = ctx.getEnvironment();
        boolean containsMyProperty = env.containsProperty("my-property");
        System.out.println("Does my environment contain the 'my-property' property? " + containsMyProperty);
    }
}
