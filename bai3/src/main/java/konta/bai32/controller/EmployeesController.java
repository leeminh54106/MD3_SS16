package konta.bai32.controller;

import konta.bai32.model.Employees;
import konta.bai32.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeesController {
//    @RequestMapping(value = {"/","initInsertEmployee"})
//    public String initInsert(Model model){
//        Employees employees = new Employees();
//        model.addAttribute("employee", employees);
//        return "insertEmployee";
//    }
//    @RequestMapping(value = "/insertEmployee",method = RequestMethod.POST)
//    public String insertEmployee(Employees employees,Model model){
//        model.addAttribute("employee",employees);
//        System.out.println(employees.getStatus());
//        return "viewEmployee";
//    }
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping
    public String employees(Model model) {
        model.addAttribute("employees",employeeService.getEmployees());
        return "employee/employees";
    }

    @GetMapping("/add")
    public String viewFormAddEmployee(){
        return "employee/add_employee";
    }

    @PostMapping("/add")
    public String handleAddEmployee(@ModelAttribute Employees employees){
        employeeService.save(employees);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String viewFormEditEmployee(@PathVariable int id, Model model){
        Employees employees = employeeService.findById(id);
        model.addAttribute("employee",employees);
        return "employee/edit_employee";
    }

    @PostMapping("/edit")
    public String handleEditEmployee(@ModelAttribute Employees employees){
        employeeService.save(employees);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String handleDeleteEmployee(@PathVariable int id){
        employeeService.delete(id);
        return "redirect:/";
    }
}
