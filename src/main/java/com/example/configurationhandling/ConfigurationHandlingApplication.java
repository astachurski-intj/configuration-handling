package com.example.configurationhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationHandlingApplication {

    public static void main(String[] args) {

        //sets ALL profiles as active Remember that values will be overwritten when duplicated across profiles.
        //System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod,dev");

        ApplicationContext ctx = SpringApplication.run(ConfigurationHandlingApplication.class, args);

        System.out.println(" -------configuration profiles in use ---------");

        for (String s : ctx.getEnvironment().getActiveProfiles()) {
            System.out.println("profile: " + s);
        }

        System.out.println("BeanToConfigure configuration: ");
        System.out.println((ctx.getBean(BeanDirectlyConfigured.class)).toString());
        System.out.println("");
        System.out.println("");

        System.out.println("BeanToConfigureSecondProd configuration: ");
        System.out.println((ctx.getBean(BeanTonConfigureSecondIntf.class)).toString());
        System.out.println("");

    }
}
