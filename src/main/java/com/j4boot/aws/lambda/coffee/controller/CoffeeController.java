package com.j4boot.aws.lambda.coffee.controller;

import com.j4boot.aws.lambda.coffee.model.Coffee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class CoffeeController {

    private static final Coffee[] coffees = {
        new Coffee(1L, "Black", 5.0),
        new Coffee(2L, "Latte", 6.00),
        new Coffee(3L, "Cappuccino", 7.0)
    };

    @RequestMapping(path = "/coffees", method = RequestMethod.GET)
    public Coffee[] books() {
        return coffees;
    }
}