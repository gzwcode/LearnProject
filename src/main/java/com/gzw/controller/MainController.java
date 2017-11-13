package com.gzw.controller;

import com.gzw.bean.Code;
import com.gzw.dao.CodeDao;
import com.gzw.service.CodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class MainController {
    @Resource
    CodeService codeService;

    @Resource
    CodeDao CodeDao;

    @RequestMapping("/gobi")
    public String aa(){

        String flag = CodeDao.selectCode("1");
        System.out.println(flag);
        return "a";
    }

}
