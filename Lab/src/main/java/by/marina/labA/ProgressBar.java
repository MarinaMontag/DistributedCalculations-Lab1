package by.marina.labA;

import javax.swing.*;

public class ProgressBar extends JProgressBar  {
    private int iterator=0;
    public ProgressBar(int y){
        super(0,100);
        setBounds(40,y,300,50);
        setValue(iterator);
        setStringPainted(true);
    }

    public int getIterator(){
        return iterator;
    }

    public void incrementIterator(){
        iterator++;
        setValue(iterator);
    }

    public void decrementIterator(){
        iterator--;
        setValue(iterator);
    }
}
