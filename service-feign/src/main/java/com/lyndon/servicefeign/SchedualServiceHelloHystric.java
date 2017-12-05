package com.lyndon.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " + name;
    }
}
