package by.marina.labA;

public class MyThread extends Thread{
    private ProgressBar bar;
    private int destination;
    MyThread(ProgressBar bar, int destination){
        super();
        this.bar=bar;
        this.destination=destination;
        this.setPriority(1);
    }

    @Override
    public void run() {
        while (true) {
            Thread.yield();
            synchronized (bar) {
                if (bar.getSemaphore() < destination)
                    bar.incrementSemaphore();
                else if (bar.getSemaphore() > destination)
                    bar.decrementSemaphore();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
