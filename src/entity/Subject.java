

package entity;

public class Subject
{
    String subjCode = "";
    String name = "";
    String sched = "";

    public Subject ( String subjCode, String name, String sched)
    {
        this.subjCode = subjCode;
        this.name = name;
        this.sched = sched;
    }

    public Subject()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSched() {
        return sched;
    }

    public void setSched(String sched) {
        this.sched = sched;
    }

    public String getSubjCode() {
        return subjCode;
    }

    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

}
