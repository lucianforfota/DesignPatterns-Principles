package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {
//        NewThread t1 = new NewThread();
//        t1.setName("Mythread-1");
//        NewThread t2 = new NewThread();
//        t2.setName("Mythread-2");
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(new NewRunnable("Thread-1"));
//        Thread t2 = new Thread(new NewRunnable("Thread-2"));
//
//        t1.start();
//        t2.start();




        ExecutorService executor = Executors.newFixedThreadPool(2);

//        executor.execute(new NewRunnable("Thread-1"));
//        executor.execute(new NewRunnable("Thread-2"));


        Runnable task = ()-> {
            while (true) {
                System.out.println("executeing on thread " + Thread.currentThread().getName());
            }
        };
        executor.execute(task);
        executor.execute(task);
    }
}
