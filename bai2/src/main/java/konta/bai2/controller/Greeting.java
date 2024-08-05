package konta.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Greeting {
    @RequestMapping(value = {"/","greeting"})
    public String greeting(@RequestParam(value = "searchQuery", required=false) String searchQuery, Model model) {
        List<String> checkResults = new ArrayList<String>();
        checkResults.add("hihi");
        checkResults.add("haha");
        checkResults.add("hoho");
        if (searchQuery != null) {
            for (String checkResult : checkResults) {
                if (checkResult.equals(searchQuery)) {
                    model.addAttribute("result", "has found" + searchQuery);
                    return "hello";
                }
            }
        }
        model.addAttribute("result", "hasn't found" + searchQuery);
        return "hello";
    }
}
