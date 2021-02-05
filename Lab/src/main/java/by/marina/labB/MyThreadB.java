package by.marina.labB;

import by.marina.labA.MyThread;
import by.marina.labA.ProgressBar;

public class MyThreadB extends MyThread {
    private Button concurrentStopButton;
    private static int semaphore=0;
    public MyThreadB(ProgressBar bar, int destination){
       super(bar, destination);
    }

    public void setButtonStop(Button concurrentStopButton){
        this.concurrentStopButton=concurrentStopButton;
    }

    public Integer getSemaphore(){
        return semaphore;
    }

    public void unblockSemaphore(){
        semaphore=0;
    }

    @Override
    public void run() {
            semaphore=1;
            while (semaphore==1) {
                if (bar.getValue() < destination)
                    bar.incrementIterator();
                else if (bar.getValue() > destination)
                    bar.decrementIterator();
                else {
                    semaphore = 0;
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            concurrentStopButton.setEnabled(true);
    }
}

