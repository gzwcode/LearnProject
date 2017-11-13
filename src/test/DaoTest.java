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
    RedisPool RedisPool;
    @Test
    public void ssss(){
        RedisPool.set("asaf","fuck u ");
        String aa = RedisPool.get("asaf");
        System.out.println(aa);
    }




}
