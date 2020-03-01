package cx.student.dao;

import cx.student.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentdao {
    public List<Student> findAll();
    public Student findBySno(int sno);
    public void addStudent(Student stu);
    public void deletStudentBySno(int sno);
    public void upDateStudentBySno(Student stu);
    public int getTotalCount();
    }

