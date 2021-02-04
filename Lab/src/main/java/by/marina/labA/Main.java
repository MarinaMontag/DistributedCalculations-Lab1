package by.marina.labA;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ProgressBar bar = new ProgressBar();
        frame.add(bar);
        frame.setSize(400, 300);
        MyThread a = new MyThread(bar, 10);
        MyThread b = new MyThread(bar, 90);
        a.setDaemon(true);
        b.setDaemon(true);
        Spinner spinnerA=new Spinner(80,a);
        Spinner spinnerB=new Spinner(250,b);
        frame.add(spinnerA.get());
        frame.add(spinnerB.get());
        frame.add(new Label("10%",50));
        frame.add(new Label("90%",220));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.start();
        b.start();
    }
}
