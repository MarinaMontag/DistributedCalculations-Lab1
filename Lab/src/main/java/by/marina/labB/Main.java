package by.marina.labB;

import by.marina.labA.ProgressBar;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ProgressBar bar = new ProgressBar(300);
        frame.add(bar);
        frame.setSize(400, 400);
        MyThreadB a = new MyThreadB(bar, 10);
        MyThreadB b = new MyThreadB(bar, 90);
        a.setDaemon(true);
        b.setDaemon(true);
        StopButton stop1=new StopButton("1",50,150,frame);
        StopButton stop2=new StopButton("2",150,150,frame);
        a.setButtonStop(stop2);
        b.setButtonStop(stop1);
        RunButton run1=new RunButton("1",stop2,50,50,frame);
        RunButton run2=new RunButton("2",stop1,150,50,frame);
        run1.setThread(a);
        stop1.setThread(a);
        run2.setThread(b);
        stop2.setThread(b);
        frame.add(run1);
        frame.add(run2);
        frame.add(stop1);
        frame.add(stop2);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
