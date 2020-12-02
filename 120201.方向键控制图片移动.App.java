package Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DemoMain {
     JPanel mypanel = new JPanel();
     JLabel aircraft = new JLabel();

    //事件初始化
    public void App(){
        java.net.URL plane = DemoMain.class.getResource("/img/plane0.png");
        aircraft.setIcon(new ImageIcon(plane));
        aircraft.setBounds(0,0,64,64);

        mypanel.setLayout(null);
        mypanel.setBackground(Color.orange);
        mypanel.add(aircraft);

        JFrame jFrame = new JFrame("飞机大战");
        jFrame.setContentPane(mypanel);
        jFrame.setSize(800,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        mypanel.setFocusable(true);


        mypanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int x = aircraft.getX();
                int y = aircraft.getY();
                int H = (int) jFrame.getSize().getHeight()-64;
                int W = (int) jFrame.getSize().getWidth()-64;
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    System.out.println("触发左");
                    x = x<=0 ? 0 : x-10;
                }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    System.out.println("触发右");
                    x = x>=W ? W : x+10;
                }else if(e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("触发上");
                   y = y<=0 ? 0 : y-15;
                }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println("触发下");
                    y = y>=H ? H : y+15;
                }
                aircraft.setLocation(x,y);
            }
        });

    }


    public static void main(String[] args) {
        new DemoMain().App();
    }

}
