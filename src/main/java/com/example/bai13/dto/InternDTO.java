package com.example.bai13.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InternDTO extends EmployeeDTO{
    private String major;
    private int semester;
    private String university_name;

    @Override
    public String toString() {
        return super.toString()+ ", major ="+major+", semester ="+semester+", university name ="+university_name;
    }
}
