package com.lethanh98.EnvironmentAbstraction.Profiles.PropertySourceAbstraction.PropertySourceAnno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * author lethanh9398 <p> email lethanh9398@gmail.com <p> create Date 1/16/2020 5:46 PM  <p> document : <p>
 * <p>- vi :
 * <p>- en :
 */

@SpringBootApplication
public class PropertySourceAnnotation {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(PropertySourceAnnotation.class, args);
    System.out.println(ctx.getEnvironment().getProperty("app"));
  }
}
