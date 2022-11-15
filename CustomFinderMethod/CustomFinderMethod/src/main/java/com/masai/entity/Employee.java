package com.masai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String empName;
    private String designation;
    private String address;
    private String company;
    private String mobileNum;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}' + "\n";
    }
}
