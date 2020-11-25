package MainDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainDemo2 {
    JPanel myjp = new JPanel();
    JTextArea jTextArea1 = new JTextArea();
    JTextArea jTextArea2 = new JTextArea();
    JLabel jLabel = new JLabel();
    JScrollPane jScrollPane = new JScrollPane();

    MainDemo2(){
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
       myjp.add(jLabel);
       jLabel.setText("魔镜魔镜，谁是世界上最帅的人？");
       jLabel.setBounds(50,10,300,30);
       jTextArea1.setBounds(50,50,300,200);
       jTextArea2.setForeground(Color.orange);
       jTextArea2.setFont(new Font("",1,16));
       jScrollPane.setBounds(50,350,300,200);
       jScrollPane.setViewportView(jTextArea2);

//      监听事件
       jTextArea1.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               super.keyPressed(e);
               if(e.getKeyCode() == KeyEvent.VK_ENTER){

                   if(jTextArea1.getText().trim().equals("白小纯")){
                       jTextArea2.append("你在放屁，下一位！\n");
                   }else if(jTextArea1.getText().trim().equals("王大锤")){
                       jTextArea2.setText("没错就是他\n");
                   }else{
                       jTextArea2.append("这谁啊这，魔镜只认识白小纯和王大锤\n");
                   }

               }
           }
       });
    }



    public static void main(String[] args) {
        new MainDemo2();
    }
}
