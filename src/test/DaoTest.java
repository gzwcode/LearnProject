import com.gzw.bean.Code;
import com.gzw.dao.CodeDao;
import com.gzw.redis.RedisPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:conf/spring.xml"})
public class DaoTest {

    @Resource
    CodeDao CodeDao;

    @Resource
    RedisPool redisPool;
    @Test
    public void ssss(){
        String id ="1";
        String value = redisPool.get("Code"+id);
        if(value==null){//redis里没有记录
            //从数据库里获取
            String flag = CodeDao.selectCode("1");
            redisPool.set("Code"+id,flag,30);
            value = redisPool.get("Code"+id);
        }
        System.out.println(value);
    }




}
