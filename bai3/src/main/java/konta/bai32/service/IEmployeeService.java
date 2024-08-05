package konta.bai32.service;

import konta.bai32.model.Employees;

import java.util.List;

public interface IEmployeeService {
    List<Employees> getEmployees();
    Employees findById(Integer id);
    void save(Employees employees); // add and update
    void delete(Integer id);
}
