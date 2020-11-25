package MainDemo;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainDemo {
    JPanel myjp = new JPanel();
    JTextArea jTextArea1 = new JTextArea();
    JTextArea jTextArea2 = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane();

    MainDemo(){
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(myjp);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(512,720);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        App();
    }

//    初始化
    public void App(){
       myjp.setLayout(null);
       myjp.add(jTextArea1);
       myjp.add(jTextArea2);
       myjp.add(jScrollPane);
       jTextArea1.setBounds(50,50,300,200);
       jScrollPane.setBounds(50,350,300,200);
       jScrollPane.setViewportView(jTextArea2);
       jTextArea1.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               super.keyPressed(e);
               if(e.getKeyCode() == KeyEvent.VK_UP){
                   jTextArea2.append("你点击了上键\n");
               }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                   jTextArea2.append("你点击了下键\n");
               }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                   jTextArea2.append("你点击了左键\n");
               }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                   jTextArea2.append("你点击了右键\n");
               }
           }
       });
    }



    public static void main(String[] args) {
        new MainDemo();
    }
}
