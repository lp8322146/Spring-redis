package com.lp.redisdome.studentdao;

import com.lp.redisdome.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentInfo,Integer>{
}
