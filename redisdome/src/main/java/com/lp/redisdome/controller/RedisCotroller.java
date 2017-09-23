package com.lp.redisdome.controller;

import com.lp.redisdome.entity.StudentInfo;
import com.lp.redisdome.studentdao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 缓存实现类
 */
@Component
public class RedisCotroller {
    //自动装配redisTemplate
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StudentDao studentDao;
    /**
     * 缓存实现
     * @return
     */
    public void findStudentInfo(){
        /**
         * 定义一个key
         */
        String key = "studentKey";
        ValueOperations<String,List<StudentInfo>> operations = redisTemplate.opsForValue();
        /**
         * 在缓存中查询是否有这个Key的存在
         */
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            List<StudentInfo> list = operations.get("studentKey");
            list.forEach(a-> System.out.println(a));
            System.out.println("在缓存中获取值");
        }else{

            List<StudentInfo> list = studentDao.findAll();
            list.forEach(a-> System.out.println(a));
            operations.set(key,list);
            System.out.println("在数据库中获取并存到缓存中");
        }
    }
}
