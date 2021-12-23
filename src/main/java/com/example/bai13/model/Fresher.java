package com.example.bai13.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="Fresher")
public class Fresher  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "graduation_date")
    private Date graduation_date;

    @Column(name = "graduation_rank")
    private String graduation_rank;

    @Column(name = "education")
    private String education;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

}
