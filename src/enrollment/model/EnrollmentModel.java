
package enrollment.model;

import entity.Student;
import entity.Subject;
import java.util.ArrayList;

public class EnrollmentModel
{
    private Student student;
    private Subject subject;
    private ArrayList <Student> studenroll;
    private ArrayList <Subject> subenroll;

    public EnrollmentModel()
    {
        student = new Student();
        subject = new Subject();
        studenroll = new ArrayList();
        subenroll = new ArrayList();
    }

    public ArrayList<Student> getStudenroll() {
        return studenroll;
    }

    public void setStudenroll(ArrayList<Student> studenroll) {
        this.studenroll = studenroll;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Subject> getSubenroll() {
        return subenroll;
    }

    public void setSubenroll(ArrayList<Subject> subenroll) {
        this.subenroll = subenroll;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }




}
