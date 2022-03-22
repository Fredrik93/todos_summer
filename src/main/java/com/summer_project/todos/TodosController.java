package com.summer_project.todos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
//https://spring.io/blog/2015/06/08/cors-support-in-spring-framework


@RestController
public class TodosController {
    HashMap<Integer, String> todos = new HashMap<Integer, String>();
    ArrayList <Todos> listOfTodos = new ArrayList<Todos>();
    Todos t1 = new Todos("");

    @CrossOrigin
    @GetMapping("/todos")
    public HashMap index() {
      //  todos.put("1", "clean");
       // todos.put("2", "gym");
       t1.todos = "clean other stuff";
        todos.put(1, t1.todos);
        return todos;
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