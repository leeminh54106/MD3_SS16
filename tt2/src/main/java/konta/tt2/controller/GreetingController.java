package konta.tt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
//    @GetMapping
//    public String viewGreeting() {
//        return "hello2";
//    }
    @GetMapping
    public String greeting() {
        return "greeting";
    }
}
