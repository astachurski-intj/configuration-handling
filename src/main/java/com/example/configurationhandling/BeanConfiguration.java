package com.example.configurationhandling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {
    @Bean
    @Primary
    @Profile("dev")
    public BeanTonConfigureSecondIntf beanToConfigureSecondDev() {
        return new BeanToConfigureSecondDev();
    }

    @Bean
    @Profile("prod")
    public BeanTonConfigureSecondIntf beanToConfigureSecondProd() {
        return new BeanToConfigureSecondProd();
    }

    @Bean
    @Profile("outsidejar")
    public BeanTonConfigureSecondIntf beanToConfigureSeconOther() {
        //we can return ANY implementation here
        return new BeanToConfigureSecondProd();
    }
}