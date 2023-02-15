package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository deparmentRepository;


    public Department saveDepartment(Department department) {
        log.info("String saveDepartment method of DepartmentService");
        return deparmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("String findDepartmentById method of DepartmentService");
        return deparmentRepository.findByDepartmentId(departmentId);
    }
}
