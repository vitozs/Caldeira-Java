package com.example.demo.controllers;

import com.example.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private final AtomicLong contador = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "nome", defaultValue = "World")  String name){
        return new Greeting(contador.incrementAndGet(), "Ola " + name);
    }

}
