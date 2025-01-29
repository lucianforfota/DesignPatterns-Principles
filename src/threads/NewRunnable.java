package threads;

public class NewRunnable implements Runnable{

    private String name;

    public NewRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int i= 0;
        while (true)
        {
            System.out.println(this.name + ": New thread is running "+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
