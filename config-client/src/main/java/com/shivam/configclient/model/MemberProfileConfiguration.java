package com.shivam.configclient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultMode(){
        return environment.getProperty("vehicle.default.model");
    }
}
