package com.lethanh98.EnvironmentAbstraction.Profiles.base;

import com.lethanh98.EnvironmentAbstraction.Profiles.base.factory.Setting;
import com.lethanh98.EnvironmentAbstraction.Profiles.base.factory.SqlFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.AbstractEnvironment;

@ComponentScan("com.lethanh98.EnvironmentAbstraction.Profiles")
public class Main {


    public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "live,settingVN");
        // cach 1
      //  System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev,settingVN");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // cach 2
        // applicationContext.getEnvironment().setActiveProfiles("dev", "settingVN");
        applicationContext.register(Main.class);
        applicationContext.refresh();
        SqlFactory sqlFactory = applicationContext.getBean(SqlFactory.class);
        System.out.println(sqlFactory.getInfo());

        Setting setting = applicationContext.getBean(Setting.class);
        System.out.println(setting.getInfo());

    }
}
