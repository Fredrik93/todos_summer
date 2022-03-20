package com.summer_project.todos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
//https://spring.io/blog/2015/06/08/cors-support-in-spring-framework
@RestController
public class HelloController {

    @CrossOrigin
    @GetMapping("/")
    public int index() {
        return 22;
    }

    @CrossOrigin
    @GetMapping("/hello")
    public int sayHi(){
        return 33;
    }


}