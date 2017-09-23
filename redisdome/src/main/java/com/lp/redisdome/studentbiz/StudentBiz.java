package com.lp.redisdome.studentbiz;

import com.lp.redisdome.entity.StudentInfo;

import java.util.List;

public interface StudentBiz {
    int addStu(StudentInfo studentInfo);
    List<StudentInfo> findAll();
}
