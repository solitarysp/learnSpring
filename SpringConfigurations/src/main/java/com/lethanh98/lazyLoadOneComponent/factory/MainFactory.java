package com.lethanh98.lazyLoadOneComponent.factory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lethanh98.lazyLoadOneComponent.main",lazyInit = true)
public class MainFactory {
}
