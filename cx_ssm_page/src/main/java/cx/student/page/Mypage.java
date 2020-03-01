package cx.student.page;

import cx.student.dao.IStudentdao;
import cx.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Mypage {
    /*数据总数： select count(*) from student; count(1)比count(*)效率高
	2.页面大小	用户自定义
	3.总页数		程序自动计算
		总页数=数据总数%页面大小==0？：数据总数/页面大小:数据总数/页面大小+1	4.当前页(页码）	用户自定义
	5.当前页的对象集合（实体类集合）
	*/
    private int TotalPage;
    private int Pagesize;
    private int PageSum;
    private int courrentPage;
    List<Student> student;
    @Autowired
    IStudentdao studentdao;
    public Mypage(int totalPage, int pagesize, int courrentPage, List<Student> student) {
        TotalPage = totalPage;
        setPagesize(pagesize);//Total的赋值在调用set方法之前，而且一定要调用set方法否则pageSum没有值
        Pagesize = pagesize;
        this.courrentPage = courrentPage;
        this.student = student;
    }

    public int getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage() {
        TotalPage=studentdao.getTotalCount();
    }

    public int getPagesize() {

        return Pagesize;
    }

    public void setPagesize(int pagesize) {
        Pagesize = pagesize;
        PageSum=TotalPage%Pagesize==0?TotalPage/Pagesize:TotalPage/Pagesize+1;
    }

    public int getPageSum() {

        return PageSum;
    }


    public int getCourrentPage() {
        return courrentPage;
    }

    public void setCourrentPage(int courrentPage) {
        this.courrentPage = courrentPage;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }


}
