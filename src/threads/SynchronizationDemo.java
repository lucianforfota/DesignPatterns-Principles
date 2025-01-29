package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;

public class SynchronizationDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        executor.execute(task);
        executor.execute(task);

        executor.shutdown();

        while(!executor.isTerminated()){

        }

        System.out.println(counter.getCount());



    }
}
