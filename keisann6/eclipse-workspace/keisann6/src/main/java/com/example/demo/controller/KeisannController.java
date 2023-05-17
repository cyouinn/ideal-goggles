package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Keisann;
import com.example.demo.repository.KeisannReository;

import jakarta.persistence.Column;

@RestController
@RequestMapping("/keisann")
public class KeisannController {
    @Autowired
    private KeisannReository keisannReository;
    
    @GetMapping("/")
    public List<Keisann> getAllStudents() {
        return (List<Keisann>) keisannReository.findAll();
    }
    
    @PostMapping("/")
    public Keisann createKeisann(@RequestBody Keisann keisann) {
        return keisannReository.save(keisann);
    }
    
	
    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        int result = a + b;
        
        Keisann keisann = new Keisann();
        keisann.setBody(a + " + " + b);
        keisann.setResult(result);  
        
        keisannReository.save(keisann);  
        
        return result;
    }

 
    @PostMapping("/addd")
    public int addd(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }
    
}
