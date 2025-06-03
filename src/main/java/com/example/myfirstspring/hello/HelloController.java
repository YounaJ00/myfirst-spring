package com.example.myfirstspring.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }

    @PostMapping("/names")
    public void addUser(HelloUserRequest request){
        helloService.addUser(request);
    }

    @GetMapping("/names/{id}")
    public String getUser(@PathVariable Long id) {
        return helloService.getUser(id);
    }

    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable Long id) {
        return helloService.sayHello(id);
    }

}
