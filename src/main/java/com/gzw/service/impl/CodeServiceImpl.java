package com.gzw.service.impl;

import com.gzw.dao.CodeDao;
import com.gzw.service.CodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CodeServiceImpl implements CodeService {

    @Resource
    CodeDao codeDao;

    public void test() {
        codeDao.getCodeBean("13630167672");
        System.out.println("aaaa");
    }
}
