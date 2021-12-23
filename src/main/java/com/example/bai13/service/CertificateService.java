package com.example.bai13.service;

import com.example.bai13.model.Certificate;
import com.example.bai13.repository.CertificateRepository;

public class CertificateService{
    private CertificateRepository cr;


    public void add(Certificate c){
        cr.save(c);
    }

    public void delete(int id){
        cr.deleteById(id);
    }
}
