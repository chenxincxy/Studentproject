package cx.student.service.impl;

import cx.student.dao.IStudentdao;
import cx.student.entity.Student;
import cx.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentdao dao;
    public List<Student> findAll() {
        return dao.findAll();
    }

    public Student findBySno(int sno) {
        return dao.findBySno(sno);
    }
    public boolean addStudent(Student stu) {
        if(findBySno(stu.getSno())==null){
            dao.addStudent(stu);
          return true;
        }
        else
           return false;
    }
    public boolean deleteStudentBySno(int sno) {
        if(dao.findBySno(sno)!=null) {
            dao.deletStudentBySno(sno);
            return true;
        }
        return false;
    }

    public boolean upDateStudentBySno(Student stu) {
        if(dao.findBySno(stu.getSno())!=null){
            dao.upDateStudentBySno(stu);
            return true;
        }
        return false;
    }



}
