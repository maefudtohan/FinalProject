

package entity;

public class Student
{
    String lname = "";
    String fname = "";
    String mname = "";
    String address = "";
    String bday = "";
    String pname = "";
    String status = "";
    String ylevel = "";
    int age;

    public Student (String lname, String fname, String mname)
    {
        this.lname = lname;
        this.fname = fname;
        this.mname = mname;
    }

    public Student ( String bday, int age, String address, String pname)
    {
        this.bday = bday;
        this.age = age;
        this.address = address;
        this.pname = pname;
    }

    public Student (String ylevel, String status)
    {
        this.ylevel = ylevel;
        this.status = status;
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

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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
