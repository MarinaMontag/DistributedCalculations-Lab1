package by.marina.labA;

import javax.swing.*;
import javax.swing.event.ChangeEvent;

public class Spinner{
   private JSpinner spinner;
   private  MyThread thread;
    Spinner(int x, MyThread thread){
        SpinnerModel value=new SpinnerNumberModel(1,1,10,1);
       spinner=new JSpinner(value);
       this.thread=thread;
       spinner.setBounds(x,50,40,40);
       spinner.addChangeListener(this::changePriority);
    }

    private void changePriority(ChangeEvent e){
        thread.setPriority((Integer) ((JSpinner)e.getSource()).getValue());
    }

    public JSpinner get(){
        return spinner;
    }
}
