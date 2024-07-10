package com.example.employeemanager.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private Double salary;
    private String departmentName;
    private LocalDateTime dbUpdateDate;

    // Getters and Setters
}
