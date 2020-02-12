package com.yuan.oa.controller;


import com.yuan.oa.biz.DepartmentBiz;
import com.yuan.oa.biz.EmployeeBiz;
import com.yuan.oa.entity.Employee;
import com.yuan.oa.global.contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private DepartmentBiz departmentBiz;

    @Autowired
    private EmployeeBiz employeeBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeBiz.findAll());
        return "employee_list";
    }

    @RequestMapping("/to_add")
    public String to_add(Map<String,Object> map){
        map.put("employee",new Employee());
        return "employee_add";
    }

    /**
     * 此处SpringMVC会自动把表单里的数据封装进department对象
     * @param employee
     * @return
     */
    @RequestMapping("/add")
    public String add(Employee employee){
        employeeBiz.add(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String to_update(String sn,Map<String,Object> map){
        map.put("employee",employeeBiz.findOne(sn));
        map.put("dlist",departmentBiz.findAll());
        map.put("plist",contant.getPosts());
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeBiz.edit(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove",params = "sn")
    public String remove(String sn){
        employeeBiz.remove(sn);
        return "redirect:list";
    }
}
