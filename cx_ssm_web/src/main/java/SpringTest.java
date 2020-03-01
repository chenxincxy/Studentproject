import cx.student.entity.Student;
import cx.student.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StudentServiceImpl studentService=(StudentServiceImpl) ac.getBean(StudentServiceImpl.class);
       List<Student> students=studentService.findAll();
       for(Student stu:students){
           System.out.println(stu);
       }
    }
}
