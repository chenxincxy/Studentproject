package cx.student.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import cx.student.entity.Student;
import cx.student.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SpringmvcController {
    @Resource
    StudentServiceImpl studentService;
    @RequestMapping("findAllController")
    public String findAllController(Model model){
      List<Student> list=studentService.findAll();
      model.addAttribute("students",list);
        return "cc";
    }

    @RequestMapping("findBySnoController")
    public String findBySnoController(@RequestParam("sno") Integer sno, Model model){
        Student student=studentService.findBySno(sno);
        model.addAttribute("student",student);
        return "Studentinfo";
    }

    @RequestMapping("addStudentController")
    public String addStudentController(Student stu){ //会自动将请求栏中的参数名对应到Student的属性名中，然后将参数值注入对应属性值
            studentService.addStudent(stu);
        return "redirect:findAllController";
    }

    @RequestMapping("deleteStudentBySno")
    public String deleteStudentBySno(@RequestParam("sno") Integer sno){
        studentService.deleteStudentBySno(sno);
        return "redirect:findAllController";
    }

    @RequestMapping("upDateStudentBySno")//UpdateStudentServlet?sno=3&sname=suolong&sage=20&saddress=baidu
    public String upDateStudentBySn(Student stu){
        studentService.upDateStudentBySno(stu);
        return "redirect:findAllController";
    }

    @RequestMapping("findAllByPage")
    public String findAllByPage(@RequestParam("currentPage") Integer currentPage){
        return "redirect:findAllController";
    }
}
