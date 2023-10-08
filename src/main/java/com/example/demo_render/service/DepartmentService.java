package com.example.demo_render.service;

// Java Program to Illustrate DepartmentService.java File

// Importing packages
// Importing required classes
import com.example.demo_render.model.Department;

import java.util.List;

// Class
public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    Department saveDepartment();

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
