package modifiers.os;

import modifiers.Employee;

public class TimedProcess extends Process {
    int max_time;

    TimedProcess(String pid, String name) {
        // super();
        super(pid, name);

    }

    TimedProcess(String pid, String name, String ppid, modifiers.os.Process p) {
        // super();
        super(pid, name, ppid, p);

    }

    @Override
    protected void kill() {
        this.parent.kill();
        System.out.println("killing after" + max_time);
    }
}