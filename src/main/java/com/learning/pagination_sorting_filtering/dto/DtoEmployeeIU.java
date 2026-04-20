package com.learning.pagination_sorting_filtering.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class DtoEmployeeIU {
    @NotBlank
    private String name;

    @NotBlank
    private String department;

    @NotBlank
    private Date joiningDate;
}
