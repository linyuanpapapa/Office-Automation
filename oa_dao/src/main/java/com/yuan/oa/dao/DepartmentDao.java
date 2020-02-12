package com.yuan.oa.dao;

import com.yuan.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department selectOne(String sn);
    List<Department> selectAll();
}
