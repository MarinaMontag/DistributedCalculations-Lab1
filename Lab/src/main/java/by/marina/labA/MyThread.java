package by.marina.labA;

import javax.swing.*;

public class MyThread extends Thread{
    private JProgressBar bar;
    private int destination;
    MyThread(JProgressBar bar, int destination){
        super();
        this.bar=bar;
        this.destination=destination;
        this.setPriority(1);
    }

    @Override
    public void run() {
        int iterator;
        while (true) {
            Thread.yield();
            synchronized (bar) {
                iterator = bar.getValue();
                if (iterator < destination)
                    iterator++;
                else if (iterator > destination)
                    iterator--;
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bar.setValue(iterator);
            }
        }
    }
}
