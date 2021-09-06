package modifiers;

public class TimedProcess extends modifiers.os.Process {
    int max_time;

    TimedProcess(String pid, String name) {
       // super();
        super(pid, name);

    }
    TimedProcess(String pid, String name,String ppid,modifiers.os.Process p) {
        // super();
        super(pid, name,ppid,p);

    }
    @Override
    protected void kill(){
       // this.parent.
        System.out.println("killing after"+max_time);
    }
}
