package by.marina.labA;

public class MyThread extends Thread{
    protected ProgressBar bar;
    protected int destination;
    public MyThread(ProgressBar bar, int destination){
        this.bar=bar;
        this.destination=destination;
        this.setPriority(1);
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Thread.yield();
            synchronized (bar) {
                if (bar.getIterator() < destination)
                    bar.incrementIterator();
                else if (bar.getIterator() > destination)
                    bar.decrementIterator();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
