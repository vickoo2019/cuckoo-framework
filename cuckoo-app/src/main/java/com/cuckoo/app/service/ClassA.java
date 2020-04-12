package com.cuckoo.app.service;

import org.springframework.beans.factory.InitializingBean;

public class ClassA implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("run afterPropertiesSet");
    }
}
