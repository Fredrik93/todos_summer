package com.summer_project.todos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
//https://spring.io/blog/2015/06/08/cors-support-in-spring-framework


@RestController
public class TodosController {
    HashMap<Integer, String> todos = new HashMap<Integer, String>();
    String [] otherList = new String [5];
    int id= 0;
    Todos t1 = new Todos("");
    public void enterFakeTodos(){
        otherList[0] = "some other chore";
        otherList[1] = "and one more";

        t1.todos = "clean other stuff";
        todos.put(10, t1.todos);
        todos.put(22, "gym");
        todos.put(20,"Groceries");
    }
    @CrossOrigin
    @GetMapping("/todos")
    public HashMap getAllTodos() {
        enterFakeTodos();
        return todos;
    }
    

    @CrossOrigin
    @PostMapping("/todos")
    public void addTodo(){
        todos.put(id, "go to school");
        id++;
        System.out.println(" id is " + id);
    }

    //and well, this too is unfinished :) 
    @DeleteMapping("/todos")
    public void removeTodo(){
    
    }

    @GetMapping("/todos/addOne")
    //this is unfinished, it returns all todos. should return one
    public String getOneTodo(){
        String oneTodo= "Default";
        for (Integer key : todos.keySet()) {
            System.out.println(key);
            if(key==22){
                oneTodo="Heeey";
                System.out.println("entered");
            }
        }
        return oneTodo;
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