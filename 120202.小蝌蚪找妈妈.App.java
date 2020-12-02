package Demo;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DemoMain2 {
    JPanel mypanel = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();

    //事件初始化
    public void App() {
        java.net.URL background = DemoMain2.class.getResource("/img/background.png");
        java.net.URL mother = DemoMain2.class.getResource("/img/mother.png");
        java.net.URL son = DemoMain2.class.getResource("/img/son.png");
        jLabel1.setIcon(new ImageIcon(background));
        jLabel1.setSize(1024, 768);
        jLabel2.setIcon(new ImageIcon(mother));
        jLabel2.setSize(64, 64);
        jLabel3.setIcon(new ImageIcon(son));
        int random_X = (int) ((Math.random() * 10) + 5) * 64;
        int random_Y = (int) ((Math.random() * 10) + 1) * 64;
        jLabel3.setBounds(random_X, random_Y, 64, 64);

        mypanel.setLayout(null);
        mypanel.setSize(1024, 768);
        mypanel.add(jLabel3);
        mypanel.add(jLabel2);
        mypanel.add(jLabel1);
        
        JFrame jFrame = new JFrame("青蛙");
        jFrame.setContentPane(mypanel);
        jFrame.setSize(1040, 805);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        mypanel.setFocusable(true);

        mypanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int x = jLabel2.getX();
                int y = jLabel2.getY();
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x = x <= 0 ? 0 : x - 64; //限制不能跳出窗口
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x = x >= 960 ? 960 : x + 64; //限制不能跳出窗口
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y = y <= 0 ? 0 : y - 64; //限制不能跳出窗口
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y = y >= 704  ? 704 : y + 64; //限制不能跳出窗口
                }
                jLabel2.setLocation(x, y);
                int x1 = jLabel3.getX();
                int y1 = jLabel3.getY();
                if (x == x1 && y == y1) {
                    JOptionPane.showMessageDialog(null, "小蝌蚪找到妈妈了", "游戏结束", JOptionPane.INFORMATION_MESSAGE);
                    int random_X = (int) ((Math.random() * 10) + 5) * 64;
                    int random_Y = (int) ((Math.random() * 10) + 1) * 64;
                    jLabel3.setBounds(random_X, random_Y, 64, 64);
                }
            }
        });

    }


    public static void main(String[] args) {
        new DemoMain2().App();
    }

}
