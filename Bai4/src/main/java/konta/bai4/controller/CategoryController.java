package konta.bai4.controller;

import konta.bai4.model.Category;
import konta.bai4.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String categories(Model model) {
        model.addAttribute("Categories",categoryService.findAll());
        return "category/category";
    }

    @GetMapping("/addC")
    public String viewFormAddEmployee(){
        return "category/addCategory";
    }

    @PostMapping("/addC")
    public String handleAddEmployee(@ModelAttribute Category category){
        categoryService.add(category);
        return "redirect:/";
    }

    @GetMapping("/editC/{id}")
    public String viewFormEditEmployee(@PathVariable int id, Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "category/editCategory";
    }

    @PostMapping("/editC")
    public String handleEditEmployee(@ModelAttribute Category category){
        categoryService.edit(category);
        return "redirect:/";
    }

    @GetMapping("/deleteC/{id}")
    public String handleDeleteEmployee(@PathVariable int id){
        System.out.println("hihi");
        categoryService.delete(id);
        return "redirect:/";
    }
}
