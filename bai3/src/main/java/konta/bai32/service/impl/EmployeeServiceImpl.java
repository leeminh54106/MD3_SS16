package konta.bai32.service.impl;

import konta.bai32.model.Employees;
import konta.bai32.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employees> employeesList = new ArrayList<Employees>();

    static {
        employeesList.add(new Employees(1,"Quang","Gia Lam", "0339389369",true));
        employeesList.add(new Employees(2,"Quang","Gia Lam", "0339389369",true));
    }

    @Override
    public List<Employees> getEmployees() {
        return employeesList;
    }

    @Override
    public Employees findById(Integer id) {
       return employeesList.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(Employees employees) {
        int indexCheck = findIndexById(employees.getId());
        if (indexCheck <0){
            //add new
            employeesList.add(employees);
        }else {
            //update
            employeesList.set(indexCheck, employees);
        }
    }

    @Override
    public void delete(Integer id) {
        int indexCheck = findIndexById(id);
        if (indexCheck >=0){
            employeesList.remove(indexCheck);
        }
    }

    public int findIndexById(Integer id) {
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
