package cx.student.entity;

public class Student {
    private int sno;
    private String sname;
    private int sage;
    private String saddress;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
    @Override
    public String toString(){
        return this.sno+","+this.sname+","+this.sage+","+this.saddress;
    }
}
