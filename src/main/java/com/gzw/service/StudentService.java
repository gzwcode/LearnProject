package com.gzw.service;

import com.gzw.bean.Student;

import java.util.List;

/**
 * @author:龚增伟
 * @desc:学生的业务接口类
 * @Date :2017/11/22 10:43
 */
public interface StudentService {

    /**
     * 通过学号获取学生bean
     * @param id
     * @return
     */
    Student selectStudentById(String id);

    /**
     * 测试List
     * @return
     */
    List<Student> getStudentList();

    /**
     * 测试
     * @param id
     * @return
     */
    Student selectStudentById2(String id);
}
