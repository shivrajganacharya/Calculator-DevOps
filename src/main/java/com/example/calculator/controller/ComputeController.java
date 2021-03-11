package com.example.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class ComputeController {

    @GetMapping("/sqroot")
    public double getRoot(@RequestParam double num) {
        return Math.sqrt(num);
    }

    @GetMapping("/factorial")
    public int getFact(@RequestParam int num) {
        int result = 1;
        for (int factor = 2; factor <= num; factor++) {
            result *= factor;
        }
        return result;
    }

    @GetMapping("/ln")
    public double getLn(@RequestParam double num) {
        return Math.log(num);
    }

    @GetMapping("/pow")
    public double getPow(@RequestParam int base, @RequestParam int power) {
        return Math.pow(base, power);
    }


}
