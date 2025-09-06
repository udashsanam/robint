package com.example.robin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobbinController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello robaslfdkdadsjflbin!";
    }

    @PostMapping("/pringname")
    public String prinName(@RequestBody String name){
        System.out.println(name);
        return "Hello " + name;
    }
}
