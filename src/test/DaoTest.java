import com.gzw.bean.Code;
import com.gzw.dao.CodeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mvc.xml", "classpath:applicationContext.xml" })
public class DaoTest {

    @Resource
    CodeDao CodeDao;

    @Test
    public void ssss(){
       Code code =   CodeDao.getCodeBean("18834114002");
        System.out.println(code);
    }
}
