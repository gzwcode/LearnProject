package com.gzw.dao;

import com.gzw.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:龚增伟
 * @desc:学生的Dao接口类
 * @Date :2017/11/22 10:45
 */

@Repository
public interface StudentDao {

    /**
     * wu
     * @param id
     * @return
     */
    Student selectStudentById(String id);

    /**
     *  无
     * @return
     */
    List<Student> getStudentList();
}
