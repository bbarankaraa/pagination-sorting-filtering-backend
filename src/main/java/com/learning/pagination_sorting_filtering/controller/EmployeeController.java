package com.learning.pagination_sorting_filtering.controller;

import com.learning.pagination_sorting_filtering.dto.DtoEmployee;
import com.learning.pagination_sorting_filtering.services.abstracts.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = {
    "https://pagination-sorting-filtering-fronte.vercel.app",
    "https://pagination-sorting-filtering-f-git-94742e-bbarankaraas-projects.vercel.app",
    "https://pagination-sorting-filtering-frontend-n0ma7xebg.vercel.app"
})
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<DtoEmployee>> fetchAllEmployees(@RequestParam(required = false, defaultValue = "1") int pageNo,
                                                               @RequestParam(required = false, defaultValue = "5") int pageSize,
                                                               @RequestParam(required = false, defaultValue = "id") String sortBy,
                                                               @RequestParam(required = false, defaultValue = "ASC") String sortDir,
                                                               @RequestParam(required = false) String search
    ) {
        return ResponseEntity.ok().body(employeeService.fetchAllEmployees(pageNo, pageSize,sortBy,sortDir,search));
    }
}
