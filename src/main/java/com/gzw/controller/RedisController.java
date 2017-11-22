package com.gzw.controller;

import com.alibaba.fastjson.JSONObject;
import com.gzw.bean.Student;
import com.gzw.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:龚增伟
 * @desc: 主要编写用于测试redis性能的页面
 * @Date :2017/11/22 10:36
 */

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/select")
    public JSONObject select(@Param("id")String id){
        //通过id获取学生
        Student student =  studentService.selectStudentById(id);
        return null;
    }
}
