package com.yuan.oa.biz;

import com.yuan.oa.entity.Department;

import java.util.List;

public interface DepartmentBiz {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department findOne(String sn);
    List<Department> findAll();
}
