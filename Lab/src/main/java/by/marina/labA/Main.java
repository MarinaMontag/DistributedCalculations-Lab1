package by.marina.labA;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ProgressBar bar = new ProgressBar();
        frame.add(bar);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyThread a = new MyThread(bar, 10);
        MyThread b = new MyThread(bar, 90);
        a.setDaemon(true);
        b.setDaemon(true);
        a.start();
        b.start();
    }
}
