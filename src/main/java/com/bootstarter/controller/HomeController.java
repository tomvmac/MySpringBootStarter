package com.bootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello world from bootstarter!";
    }

}
