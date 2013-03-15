

package entity;

public class Student
{
    String fullname = "";
    String address = "";
    String bday = "";
    String pname = "";
    String status = "";
    String course = "";
    String ylevel = "";
    int age;


   public Student ( String fullname, String bday, int age, String address, String pname)
    {
        this.fullname = fullname;
        this.bday = bday;
        this.age = age;
        this.address = address;
        this.pname = pname;
    }

    public Student (String ylevel, String status,String course)
    {
        this.ylevel = ylevel;
        this.status = status;
        this.course = course;
    }

    public Student ()
    {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBday() {
        return bday;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getYlevel() {
        return ylevel;
    }

    public void setYlevel(String ylevel) {
        this.ylevel = ylevel;
    }


}
