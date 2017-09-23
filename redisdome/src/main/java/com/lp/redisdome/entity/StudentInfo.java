package com.lp.redisdome.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class StudentInfo {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;
    private String phone;
}
