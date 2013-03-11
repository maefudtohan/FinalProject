

package entity;

public class Subject
{
    String subjCode = "";
    String name = "";
    String sched = "";
    int slot;

    public Subject ( String subjCode, String name, String sched, int slot)
    {
        this.subjCode = subjCode;
        this.name = name;
        this.sched = sched;
        this.slot = slot;
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

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getSubjCode() {
        return subjCode;
    }

    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

}
