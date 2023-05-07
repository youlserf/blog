package com.primalcode.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primalcode.blog.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}