
package enrollment.controller;

import enrollment.model.EnrollmentModel;
import enrollment.view.EnrollmentView;
import entity.Student;
import entity.Subject;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EnrollmentController
{
    private EnrollmentView view;
    private EnrollmentModel model;

    public EnrollmentController (EnrollmentView view, EnrollmentModel model)
    {
        this.view = view;
        this.model = model;
    }

    public void add()
    {
        model.getStudent().setFullname(view.getTxt_fullName().getText());
        model.getStudent().setAddress(view.getTxt_address().getText());
        model.getStudent().setAge(view.getTxt_age().getX());
        model.getStudent().setBday(view.getTxt_bday().getText());
        model.getStudent().setPname(view.getTxt_pName().getText());
        model.getStudent().setStatus(view.getTxt_status().getText());
        model.getStudent().setCourse(view.getTxt_course().getText());
        model.getStudent().setYlevel(view.getTxt_ylevel().getText());

        model.getStudenroll().add(model.getStudent());
        model.setStudent(new Student());
        System.out.println("hhhhhh");
        rebind();

        view.getTxt_fullName().setText("");
        view.getTxt_address().setText("");
        view.getTxt_age().setText("");
        view.getTxt_bday().setText("");
        view.getTxt_pName().setText("");
        view.getTxt_status().setText("");
        view.getTxt_course().setText("");
        view.getTxt_ylevel().setText("");

    }

    public void add1()
    {
        model.getSubject().setName(view.getTxt_subjName().getText());
        model.getSubject().setSubjCode(view.getTxt_subjCode().getText());
        model.getSubject().setSched(view.getTxt_sched().getText());

        model.getSubenroll().add(model.getSubject());
        model.setSubject(new Subject());

        rebind1();

        view.getTxt_subjName().setText("");
        view.getTxt_subjCode().setText("");
        view.getTxt_sched().setText("");


    }

    private void rebind1()
    {
        view.getBindingGroup().getBinding("subject").unbind();
        view.getBindingGroup().getBinding("subject").bind();
        
    }

    private void rebind()
    {
        view.getBindingGroup().getBinding("student").unbind();
        view.getBindingGroup().getBinding("student").bind();
    }

    public void delete()
    {
        int i = 0;
       String val = "";
       ArrayList <Student> studenroll = model.getStudenroll();
            val = JOptionPane.showInputDialog( "Enter no.");
            i = Integer.parseInt(val);
            Student student = (Student)studenroll.get(i-1);
            studenroll.remove(i-1);
        rebind();
    }

    public void delete1()
    {
       int i = 0;
       String val = "";
       ArrayList <Subject> subenroll = model.getSubenroll();
            val = JOptionPane.showInputDialog( "Enter no.");
            i = Integer.parseInt(val);
            Subject subject = (Subject)subenroll.get(i-1);
            subenroll.remove(i-1);
        rebind1();
    }

    public void edit()
    {
    }

    public void save()
    {
    }
}

