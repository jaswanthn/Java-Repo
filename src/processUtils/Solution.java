package processUtils;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    // hashmap to store the data structure with parent child relationship
    public static HashMap<Integer, Process> processMap = new HashMap<>();

    public static void main(String[] args) {
        // task to read each process from console
        // make sure we have root process in map
        Process root = new Process(0, -1, "Process0");
        processMap.put(0, root);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                sc.close();
                break;
            }
            processInputData(input);
        }
        printInLevels(root,0);
    }

    public static void processInputData(String str) {
        String[] strArr = str.split("\\s+");
        int PID = Integer.parseInt(strArr[0]);
        int PPID = Integer.parseInt(strArr[1]);
        String comm = strArr[2];

        // create new process
        Process p = new Process(PID, PPID, comm);

        // need to make sure if this is real parent
        // and to update the details of dummmy parent in the map
        if (processMap.containsKey(PID)) {
            Process par = processMap.get(PID);
            par.PPID = PPID;
            par.Comm = comm;
        } else {
            processMap.put(PID, p);
        }

        // if parent exists in map
        if (processMap.containsKey(PPID)) {
            // get the record and add to its children
            // also this could become a new parent for upcoming process
            Process parent = processMap.get(PPID);
            parent.children.add(p);
        } else {
            // create a dummy parent and add to it
            Process dummyParent = new Process(PPID, null, null);
            dummyParent.children.add(p);
            processMap.put(PPID, dummyParent);
        }
    }

    public static void printInLevels(Process root, int level) {
        if (root == null) {
            return;
        }

        // indent based on level
        System.out.println();
        indentTab(level);
        System.out.print(root);

        for (Process child : root.children) {
            printInLevels(child, level + 1);
        }
    }

    public static void indentTab(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
}
