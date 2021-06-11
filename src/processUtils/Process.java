package processUtils;

import java.util.*;

public class Process {
    Integer PID;
    Integer PPID;
    String Comm;
    List<Process> children;

    public Process(Integer PID, Integer PPID, String Comm) {
        this.PID = PID;
        this.PPID = PPID;
        this.Comm = Comm;
        this.children = new ArrayList<>();
    }

    @Override
    public String toString() {
        return PID + " " + PPID + " " + Comm;
    }
}
