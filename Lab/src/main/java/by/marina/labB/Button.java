package by.marina.labB;

import javax.swing.*;


abstract class Button extends JButton {
    protected MyThreadB thread;
    protected final JFrame f;
   public Button(int x, int y, JFrame f){
        super();
        this.f=f;
        setBounds(x,y,70, 50);
    }

    public void setThread(MyThreadB thread){
        this.thread=thread;
    }

}
