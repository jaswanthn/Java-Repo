package threadsDemo;

public class ThreadEx2 {

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1("thread 1", 6 , 2);
        ThreadEx1 t2 = new ThreadEx1("thread 2", 25, 5);

        t1.start();

//        try
//        {
//            t1.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }


        t2.start();


    }

}
