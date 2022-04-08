package Multithreading;

public class demomultithreading1 extends Thread{

    public void run(){
        if(this.isDaemon()){

            System.out.println("it is a daemon thread");
        }
        else{
            System.out.println("it is a user thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demomultithreading1 thread1 = new demomultithreading1();
        demomultithreading1 thread2 = new demomultithreading1();
        demomultithreading1 thread3 = new demomultithreading1();
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();
synchronized (thread1){
    thread1.wait();
}

        Thread.sleep(10000);
thread2.notifyAll();
//thread1.start();

        //thread1.sl
        //thread1.start();

    }

}
