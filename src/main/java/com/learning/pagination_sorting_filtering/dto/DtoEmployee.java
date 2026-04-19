package com.learning.pagination_sorting_filtering.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DtoEmployee {
    private Long id;
    private String name;
    private String department;
    private Date joiningDate;
}
