package konta.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Greeting {

    //    @RequestMapping(value = {"/","/greeting"})
//    public String greeting(@RequestParam("money")Double money,@RequestParam("rateMoney")Double rate) {
//        return "hello";
//    }
    @RequestMapping(value = {"/", "/greeting"})
    public String greeting(@RequestParam(value = "money", required = false) Double money,
                           @RequestParam(value = "rateMoney", required = false) Double rate,
                           Model model) {
        if (money != null && rate != null) {
            double result = money * rate;
            model.addAttribute("money", money);
            model.addAttribute("rateMoney", rate);
            model.addAttribute("result", result);
            return "result";
        }
        return "hello";
    }
}
