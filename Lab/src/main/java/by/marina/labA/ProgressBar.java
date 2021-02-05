package by.marina.labA;

import javax.swing.*;

public class ProgressBar extends JProgressBar  {
    private int semaphore=0;
    ProgressBar(){
        super(0,100);
        setBounds(40,150,300,50);
        setValue(semaphore);
        setStringPainted(true);
    }

    public synchronized int getSemaphore(){
        return semaphore;
    }

    public synchronized void incrementSemaphore(){
        semaphore++;
        setValue(semaphore);
    }

    public synchronized void decrementSemaphore(){
        semaphore--;
        setValue(semaphore);
    }
}
