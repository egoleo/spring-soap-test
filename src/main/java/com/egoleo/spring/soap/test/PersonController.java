package com.egoleo.spring.soap.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/person")
    public Person getPerson() {
        return new Person("James", 58);
    }

    @RequestMapping("/lady")
    public Person getLady() {
        return new Person("Melania", 44);
    }
}
