package by.marina.labB;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RunButton extends Button{
    private StopButton stopButton;
    public RunButton(String number,StopButton stopButton, int x, int y, JFrame f){
        super(x,y,f);
        setText("Run "+number);
        this.stopButton=stopButton;
        addActionListener(this::work);
    }


    private void work(ActionEvent e){
            if(thread.getSemaphore()==0){
                if(((JButton)e.getSource()).getText().equals("Run 1"))
                    thread.setPriority(1);
                else
                    thread.setPriority(10);
                thread.start();
                stopButton.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(f,"Blocked by concurrent thread","Alert",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
