package com.webla.product.entity;

import javax.persistence.*;

@Entity
//employee
public class Employee {

    @Id
    @Column(name = "employee_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(table = "id_gen",
            pkColumnName = "gen_name",
            valueColumnName = "gen_val",
            name = "employeeIdGenerator",
            allocationSize = 100)
    @GeneratedValue(strategy =  GenerationType.TABLE, generator = "employeeIdGenerator")
    private int empoyeeId;

    private String name;

    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public String getName() {
        return name;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
