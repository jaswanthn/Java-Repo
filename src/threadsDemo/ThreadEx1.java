package threadsDemo;

public class ThreadEx1 extends Thread
{
    private String threadName;
    private int a;
    private int b;

    public ThreadEx1(String name, int a, int b) {

        this.threadName = name;
        this.a = a;
        this.b = b;

    }

    @Override
    public void run() {

        System.out.println(threadName +  " started executing");


        BasicOperations bo = new BasicOperations();

        bo.display("sum of two numbers performed by " + threadName + ": " + bo.add(a, b));
        bo.display("diff of two numbers performed by " + threadName + ": " + bo.sub(a, b));
        bo.display("mul of two numbers performed by " + threadName + ": " + bo.mul(a, b));
        bo.display("div of two numbers performed by " + threadName + ": " + bo.div(a, b));

    }


}
