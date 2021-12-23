package com.example.bai13.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name ="certificate")
public class Certificate {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "certificateName")
    private String certificateName;

    @Column(name = "certificateRank")
    private String certificateRank;

    @Column(name = "certificatedDate")
    private Date certificatedDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
