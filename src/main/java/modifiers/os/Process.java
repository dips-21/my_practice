package modifiers.os;

public class Process {
   private String name;
    private String pid;
    private String ppid;
    protected Process parent;
    public Process(String name, String pid){
        this(name,pid,null,null);
    }
    public Process(String name, String pid, String ppid, Process parent) {
        this.name = name;
        this.pid = pid;
        this.ppid = ppid;
        this.parent=parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getPid() {
        return pid;
    }

    public String getPpid() {
        return ppid;
    }

    protected void kill(){
        System.out.println("killing pid");
        System.out.println("killing pid");
    }

    void print(){
        System.out.println("--print--");
    }

    @Override
    public String toString() {
        return "Process{" +
                "name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", ppid='" + ppid + '\'' +
                ", parent=" + parent +
                '}';
    }
}
