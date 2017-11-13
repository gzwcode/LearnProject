package com.gzw.dao;

import com.gzw.bean.Code;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
    Code getCodeBean(String mobile);
}
