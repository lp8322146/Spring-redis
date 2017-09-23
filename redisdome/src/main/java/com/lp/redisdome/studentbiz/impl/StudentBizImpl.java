package com.lp.redisdome.studentbiz.impl;

import com.lp.redisdome.entity.StudentInfo;
import com.lp.redisdome.studentbiz.StudentBiz;
import com.lp.redisdome.studentdao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentBizImpl implements StudentBiz {
    @Autowired
    StudentDao studentDao;
    @Override
    public int addStu(StudentInfo studentInfo) {
        studentDao.save(studentInfo);
        return 0;
    }

    @Override
    public List<StudentInfo> findAll() {

        List<StudentInfo> list= studentDao.findAll();
        return list;
    }
}
