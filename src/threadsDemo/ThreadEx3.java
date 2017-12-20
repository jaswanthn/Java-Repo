package threadsDemo;

class ThreadEx3 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        ThreadEx3 t1=new ThreadEx3();
        ThreadEx3 t2=new ThreadEx3();

        // it runs the thread in the same call stack, doesn't treat like a new thread
        // and it excutes like normal object but not thread object
        t1.run();
        t2.run();
    }
}