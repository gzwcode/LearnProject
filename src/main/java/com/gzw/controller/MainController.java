package com.gzw.controller;

import com.gzw.bean.Code;
import com.gzw.dao.CodeDao;
import com.gzw.redis.RedisPool;
import com.gzw.service.CodeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class MainController {
    @Resource
    CodeService codeService;

    @Resource
    CodeDao CodeDao;

    @Resource
    RedisPool redisPool;

    @RequestMapping("/gobi")
    public String aa(@Param("id")String id){

        String value = redisPool.get("Code"+id);
        if(value==null){//redis里没有记录
            //从数据库里获取
            String flag = CodeDao.selectCode("1");
            redisPool.set("Code"+id,flag,30);
            value = redisPool.get("Code"+id);
        }
        System.out.println(value);

        return "a";
    }

}
