package com.learning.pagination_sorting_filtering.services.abstracts;

import com.learning.pagination_sorting_filtering.dto.DtoEmployee;
import com.learning.pagination_sorting_filtering.dto.DtoEmployeeIU;
import com.learning.pagination_sorting_filtering.model.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<DtoEmployee> fetchAllEmployees(int pageNo,int pageSize,String sortBy,String sortDir,String search);
    DtoEmployee saveEmployee(DtoEmployeeIU dtoEmployeeIU);
}
