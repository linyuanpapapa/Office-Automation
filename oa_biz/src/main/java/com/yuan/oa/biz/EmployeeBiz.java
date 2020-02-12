package com.yuan.oa.biz;


import com.yuan.oa.entity.Employee;

import java.util.List;

public interface EmployeeBiz {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee findOne(String sn);
    List<Employee> findAll();
}
