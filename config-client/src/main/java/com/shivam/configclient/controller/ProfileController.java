package com.shivam.configclient.controller;

import com.shivam.configclient.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping(value = "/profile")
    public String getDeafuleMode(){
        return memberProfileConfiguration.getDefaultMode();
    }
}
