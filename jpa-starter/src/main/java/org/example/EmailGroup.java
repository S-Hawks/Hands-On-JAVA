package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EmailGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //TODO:Need to remember
    /*If we don't use mappedBy this bidirectional relationship for many to many will
    Create 2 separate table one for employee many-to-many relationship and another for
    In Employee class for emailGroup many-to-many relationship By using mappedBy it will tell
    JPA that This 2 filed is associated with each other don't create 2 table create one table.*/
    @ManyToMany(mappedBy = "emailGroups")
    private List<Employee> employees = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
