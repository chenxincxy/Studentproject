import cx.student.dao.IStudentdao;
import cx.student.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void test() throws IOException {
        InputStream in = Resources.getResourceAsStream("Config.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象

       IStudentdao dao = session.getMapper(IStudentdao.class);
        List<Student> students=dao.findAll();
        for(Student stu:students) {
            System.out.println(stu);
        }
    }
}
