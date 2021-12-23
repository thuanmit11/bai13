package com.example.bai13.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.*;
import java.io.Serializable;


@Entity(name="intern")
@Data
@Table(name = "intern")
public class Intern implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", nullable = true , referencedColumnName = "id")
    private Employee employee;

    @Column(name = "major")
    private String major;

    @Column(name = "semester")
    private int semester;

    @Column(name = "university_name")
    private String university_name;
}
