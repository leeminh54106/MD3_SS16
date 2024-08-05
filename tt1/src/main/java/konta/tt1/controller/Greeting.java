package konta.tt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greeting {
    //Định nghĩa đường vào đầu tiên.
    @GetMapping
    public String viewGreeting() {
        return "hello2";
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "hello";
    }
}
