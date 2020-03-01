package cx.student.service;

import cx.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IStudentService {
    public List<Student> findAll();
    public Student findBySno(int sno);
    public boolean addStudent(Student stu);
    public boolean deleteStudentBySno(int sno);
    public boolean upDateStudentBySno(Student stu);
}
