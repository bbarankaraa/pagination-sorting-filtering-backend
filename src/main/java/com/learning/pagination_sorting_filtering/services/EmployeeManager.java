package com.learning.pagination_sorting_filtering.services;

import com.learning.pagination_sorting_filtering.dto.DtoEmployee;
import com.learning.pagination_sorting_filtering.dto.DtoEmployeeIU;
import com.learning.pagination_sorting_filtering.model.Employee;
import com.learning.pagination_sorting_filtering.repository.EmployeeRepository;
import com.learning.pagination_sorting_filtering.services.abstracts.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> fetchAllEmployees(int pageNo, int pageSize, String sortBy, String sortDir, String search) {

        Sort sort = null;
        if (sortDir.equalsIgnoreCase("ASC")) {
            sort = Sort.by(sortBy).ascending();
        } else {
            sort = Sort.by(sortBy).descending();
        }
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);

        List<DtoEmployee> dtoEmployees = new ArrayList<>();
        List<Employee> employees;
        if (search != null) {
            employees = employeeRepository.findByNameContainingIgnoreCase(search, pageable);
        } else {
            employees = employeeRepository.findAll(pageable).getContent();
        }
        for (Employee employee : employees) {
            DtoEmployee dtoEmployee = new DtoEmployee();
            BeanUtils.copyProperties(employee, dtoEmployee);
            dtoEmployees.add(dtoEmployee);
        }

        return dtoEmployees;
    }

    @Override
    public DtoEmployee saveEmployee(DtoEmployeeIU dtoEmployeeIU) {

        Employee employee = new Employee();
        BeanUtils.copyProperties(dtoEmployeeIU,employee);

        Employee savedEmployee = employeeRepository.save(employee);
        DtoEmployee dtoEmployee = new DtoEmployee();
        BeanUtils.copyProperties(savedEmployee,dtoEmployee);

        return dtoEmployee;
    }
}
