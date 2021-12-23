package com.example.bai13.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name="employee")
@Data
@Table(name ="employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "employee_type")
    private int employee_type;

    @Column(name = "employee_count")
    private int employee_count;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Fresher fresher;

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Experience experience;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Intern intern;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Experience experience;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    @JsonIgnore
    private Intern intern;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", orphanRemoval = true)
    @JsonIgnore
    private List<Certificate> certificates;
}
