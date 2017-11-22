package com.gzw.service.impl;

import com.gzw.bean.Student;
import com.gzw.dao.StudentDao;
import com.gzw.redis.RedisPool;
import com.gzw.redis.RedisUtil;
import com.gzw.service.StudentService;
import com.gzw.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @author:龚增伟
 * @desc:学生的业务接口实现类
 * @Date :2017/11/22 10:44
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Autowired
    RedisUtil redisPool;

    @Override
    public Student selectStudentById(String id) {
        //先从redis里获取Student
        Student student =(Student)redisPool.getData4Object2Redis(id);
        System.out.println("从redis获取的值为"+student);
        if(student==null){
            //从数据库获取student
            System.out.println("redis里获取的值为null时先从数据库获取该查询的值，再set到redis里去，下次就不需要经过数据库了");
            student = studentDao.selectStudentById(id);
            System.out.println("数据库取到的值为"+student);
            redisPool.setData4Object2Redis(id,student);
            //设置缓存存留时间
            redisPool.expire(id,30);
        }
        return student;
    }


    @Override
    public List<Student> getStudentList() {
        List<Student> list = (List<Student>)redisPool.getData4Object2Redis("studentList");
        if(list==null){
            list = studentDao.getStudentList();
            redisPool.setData4Object2Redis("studentList",list);
        }
        return list;
    }

    @Override
    public Student selectStudentById2(String id) {

        //先从redis里获取Student
        Student student =(Student)redisPool.getData4Object2Redis(id);
        System.out.println("从redis获取的值为"+student);
        if(student==null){
            //从数据库获取student
            System.out.println("redis里获取的值为null时先从数据库获取该查询的值，再set到redis里去，下次就不需要经过数据库了");
            student = studentDao.selectStudentById(id);
            System.out.println("数据库取到的值为"+student);
            redisPool.setData4Object2Redis(id,student);
        }
        return student;
    }
}
