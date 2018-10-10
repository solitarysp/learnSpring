package com.higgsup.ProfilesEnvironments.Profiles.base.service;

import com.higgsup.ProfilesEnvironments.Profiles.base.factory.Setting;
import com.higgsup.ProfilesEnvironments.Profiles.base.factory.SqlFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Config {
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
        sqlEntity.setName("mysql");
        sqlEntity.setInfo("connect by live");
        return sqlEntity;
    }

    @Bean
    @Profile("settingVN")
    public Setting getSettingVN() {
        Setting setting = new Setting();
        setting.setId(1);
        setting.setInfo("setting for vn");
        return setting;
    }

    @Bean
    @Profile("settingThaiLan")
    public Setting getSettingThaiLan() {
        Setting setting = new Setting();
        setting.setId(1);
        setting.setInfo("setting for ThaiLan");
        return setting;
    }
}
