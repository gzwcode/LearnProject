import com.gzw.bean.Student;
import com.gzw.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

/**
 * @author:龚增伟
 * @desc:学生的测试类
 * @Date :2017/11/22 11:50
 */


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/spring.xml"})
public class StudentTest {

    @Autowired
    StudentService studentService;


    @Autowired
    private JedisPool jedisPool;

    @Test
    public void test1(){
      Student student =  studentService.selectStudentById("2");
        System.out.println(student);
    }


    @Test
    public void test2(){
        List<Student> list = studentService.getStudentList();
        System.out.println(list);
    }

    @Test
    public void test3(){
        //设置redis里的值失效
        Student student =  studentService.selectStudentById2("1");
    }

    @Test
    public void test4(){
       Jedis jedis =  jedisPool.getResource();
       jedis.hset("hashset","121214","123");
        jedis.hset("hashset","1","123");

        String a = jedis.hget("hashset","1");
        System.out.println(a);
    }
}
