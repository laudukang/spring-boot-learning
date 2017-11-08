package me.codz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Created with IDEA
 * <p>Author: lau
 * <p>Date: 2017/5/1
 * <p>Time: 17:54
 * <p>Version: 1.0
 */
@RestController
public class HomeController {

    @RequestMapping("/hi")
    public String hi() {
        System.out.println("hi lau");
        return "hi lau";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home");
        return "home";
    }
}
