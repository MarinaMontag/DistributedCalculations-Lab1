package by.marina.labB;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class StopButton extends Button{
    StopButton(String number,int x, int y, JFrame f){
        super(x,y,f);
        setText("Stop "+number);
        addActionListener(this::work);
    }
    private void work(ActionEvent e){
        thread.unblockSemaphore();
    }
}
