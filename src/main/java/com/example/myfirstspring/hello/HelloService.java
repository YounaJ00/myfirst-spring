package com.example.myfirstspring.hello;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service

public class HelloService {

    public static Map<Long, String> names = new HashMap<>();
    public String sayHello() {
        return "Hello World!";
    }

    public void addUser(HelloUserRequest request) {
        names.put(request.id(), request.name());
    }

    public String getUser(Long id) {
        return names.get(id);
    }
}
