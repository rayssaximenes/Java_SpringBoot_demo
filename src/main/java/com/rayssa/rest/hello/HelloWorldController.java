package com.rayssa.rest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHelloWorld() {
        return new Greeting("Hello, guys!");
    }

    @GetMapping("/hello")
    @ResponseBody
    public Greeting sayHelloToYou(String name) {
        return new Greeting(String.format("Hello, %s", name));
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public Greeting sayHelloToYouForce(@PathVariable String name) {
        return new Greeting(String.format("Hello, %s", name));
    }



}
