package com.rocky.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

    @EmbeddedId
    private EmployeePrimaryKey employeePrimaryKey;

    @JsonProperty("employeeName")
    private String employeeName;

    @JsonProperty("employeeSalary")
    private String employeeSalary;

    @JsonProperty("designation")
    private String designation;

    @JsonProperty("department")
    private String department;

    @JsonProperty("skillSet")
    private String skillSet;

    /*@JsonProperty("address")
    private Address address;

    @JsonProperty("contactDetails")
    private ContactDetails contactDetails;*/


}
