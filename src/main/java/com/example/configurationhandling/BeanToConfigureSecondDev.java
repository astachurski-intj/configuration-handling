package com.example.configurationhandling;

import lombok.ToString;

public class BeanToConfigureSecondDev implements BeanTonConfigureSecondIntf {
    @Override
    public String getName() {
        return "devname";
    }

    @Override
    public int number() {
        return 111;
    }

    @Override
    public String toString() {
        return getName() + "/" + number();
    }
}
