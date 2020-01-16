package com.lethanh98.EnvironmentAbstraction.Profiles.example_spring_boot.config;

import com.lethanh98.EnvironmentAbstraction.Profiles.example_spring_boot.factory.SqlFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class ConfigConnectSql {
    @Bean
    @Profile("dev")
    public SqlFactory getConnectDev() {
        SqlFactory sqlEntity = new SqlFactory();
        sqlEntity.setName("sql server");
        sqlEntity.setInfo("connect by dev");
        return sqlEntity;
    }
    @Bean
    @Profile("live")
    public SqlFactory getConnectLive() {
        SqlFactory sqlEntity = new SqlFactory();
        sqlEntity.setName("MySql");
        sqlEntity.setInfo("connect by live");
        return sqlEntity;
    }

}
