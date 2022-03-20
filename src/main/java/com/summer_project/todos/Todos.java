package com.summer_project.todos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
//https://spring.io/blog/2015/06/08/cors-support-in-spring-framework
@RestController
public class Todos {

    @CrossOrigin
    @GetMapping("/todos")
    public String index() {
        return "todoslist";
    }

    @CrossOrigin
    @GetMapping("/todos/hello")
    public int sayHi(){
        int a = 5; 
        int b = 5;
        int c = a*b;
        System.out.println("A message to the system");
        return c;
    }


}