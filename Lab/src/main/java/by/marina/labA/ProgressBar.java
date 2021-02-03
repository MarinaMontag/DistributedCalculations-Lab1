package by.marina.labA;

import javax.swing.*;

public class ProgressBar extends JProgressBar  {
    ProgressBar(){
        super(0,100);
        setBounds(40,40,160,30);
        setValue(0);
        setStringPainted(true);
    }
}
