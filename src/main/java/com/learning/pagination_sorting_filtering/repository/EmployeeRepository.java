package com.learning.pagination_sorting_filtering.repository;

import com.learning.pagination_sorting_filtering.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
