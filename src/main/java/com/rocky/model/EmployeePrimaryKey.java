package com.rocky.model;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class EmployeePrimaryKey implements Serializable {

    private String employeeid;

    private String employeeUUID = UUID.randomUUID().toString();
}
