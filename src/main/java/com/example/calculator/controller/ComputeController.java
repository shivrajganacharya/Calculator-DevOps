package com.example.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class ComputeController {

    @GetMapping("/sqroot")
    public double getRoot(@RequestParam double num) {
        System.out.println("In getRoot()");
        return Math.sqrt(num);
    }


}
