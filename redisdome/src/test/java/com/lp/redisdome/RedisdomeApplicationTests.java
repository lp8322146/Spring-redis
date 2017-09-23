package com.lp.redisdome;

import com.lp.redisdome.controller.RedisCotroller;
import com.lp.redisdome.entity.StudentInfo;
import com.lp.redisdome.studentdao.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Max;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisdomeApplicationTests {
	@Autowired
	StudentDao studentDao;
	@Autowired
	RedisCotroller redisCotroller;
	@Test
	public void redisTest(){
		redisCotroller.findStudentInfo();
	}
	@Test
	public void contextLoads() {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setName("jack");
		studentInfo.setPhone("123456");
		studentInfo.setSex("男");
		studentDao.save(studentInfo);
	}
	@Test
	public void testFindAll(){
		List<StudentInfo> list=studentDao.findAll();
		list.forEach(a-> System.out.println(a));
	}

}
