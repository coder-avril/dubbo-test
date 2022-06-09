package com.lding.ds.impl;

import com.lding.da.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String greet(String name) {
        System.out.println("name = " + name);
        return "hello: " + name;
    }
}
