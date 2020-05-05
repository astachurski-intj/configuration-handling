package com.example.configurationhandling;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class BeanToConfigureSecondProd implements BeanTonConfigureSecondIntf {
    @Override
    public String getName() {
        return "prodname";
    }

    @Override
    public int number() {
        return 239;
    }

    @Override
    public String toString() {
        ArrayList bub = new ArrayList();
        return getName() + "/" + number();
    }
}
