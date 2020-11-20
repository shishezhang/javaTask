package Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MoleDemo {
    private JPanel jp;
    private JLabel bingjing;
    private JPanel content1;
    private JPanel content2;
    private JButton start;
    private JButton end;
    private JTextArea countNum;
    private JLabel countLB;
    private JLabel diglett;
    private JTextArea gameRecord;
    private JLabel gamelb;

    //    游戏总分
    int gamenum = 0;

//    地鼠坐标
    int x = 0;
    int y = 0;
//    游戏区域大小
    int w = 0;
    int h = 0;
//    游戏启动标记
    int gamemark = 0;

//    时间格式
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


    void App(){

        jp= new JPanel();
        bingjing = new JLabel();
        content1 = new JPanel();
        content2 = new JPanel();
        start = new JButton("开始游戏");
        end = new JButton("结束游戏");
        countNum = new JTextArea(4,170);
        countLB = new JLabel("统计分数");
        diglett = new JLabel();
        gameRecord = new JTextArea(4,170);
        gamelb = new JLabel("游戏记录");
        content1.setSize(100,100);


        JFrame frame = new JFrame("自制打地鼠游戏");

        frame.setSize(1024,720);

        frame.setLayout(new BorderLayout());
        java.net.URL background = MoleDemo.class.getResource("/resource/background.jpg");
        bingjing.setIcon(new ImageIcon(background));
        content1.add(diglett);
        content1.add(bingjing);


        content2.setLayout(new GridLayout(15,1,5,5));
        content2.add(start);
        content2.add(end);
        content2.add(countLB);
        content2.add(countNum);
        content2.add(gamelb);
        content2.add(gameRecord);


        jp.setLayout(null);
        content1.setBounds(0,0,800,720);
        content2.setBounds(824,0,185,720);
        jp.add(content1);
        jp.add(content2);

//        frame.add(content1,BorderLayout.CENTER);
//        frame.add(content2,BorderLayout.EAST);
        frame.setContentPane(jp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //初始化
        gameStart();
    }

//    游戏初始化
    public void gameStart(){

        diglett.setSize(100,100);//地鼠大小
        content1.setLayout(null);
//        获取游戏区域
        Dimension size = content1.getSize();
        w = size.width;
        h = size.height;

//jar包内获取路劲
        java.net.URL paoURL = MoleDemo.class.getResource("/resource/pao.gif");
        java.net.URL zaiURL = MoleDemo.class.getResource("/resource/pao.gif");

//        开始游戏
        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                游戏启动
                gamemark = 1;
                countNum.setText(gamenum+"");//初始分数
//              添加老鼠
                diglett.setIcon(new ImageIcon(paoURL));
//                随机坐标
                x = (int)((Math.random()*w));
                System.out.println("X轴目前值："+x);
                y = (int)((Math.random()*h));
                System.out.println("Y轴目前值："+y);
                diglett.setLocation(x<100?x:x-100,y<100?y:y-100);
            }
        });

//        老鼠点击事件
        diglett.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                加分
                gamenum = gamenum+10;
                countNum.setText(gamenum+"");
//                改变老鼠
                diglett.setIcon(new ImageIcon(zaiURL));

//                延时改变地鼠位置
                java.util.Timer timer = new java.util.Timer();// 实例化Timer类
                timer.schedule(new TimerTask() {
                    public void run() {
//                       改变地鼠位置和图片
                        diglett.setIcon(new ImageIcon(paoURL));
//                      随机坐标
                        x = (int)((Math.random()*w));
                        System.out.println("X轴目前值："+x);
                        y = (int)((Math.random()*h));
                        System.out.println("Y轴目前值："+y);
                        diglett.setLocation(x<100?x:x-100,y<100?y:y-100);
//                       关闭
                        this.cancel();
                    }
                }, 200);// 这里百毫秒
            }
        });

//        点击其他地方游戏结束
        content1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(gamemark ==1){
                    JOptionPane.showMessageDialog(null, "游戏结束总得分："+gamenum, "游戏结束",JOptionPane.INFORMATION_MESSAGE);
//               游戏记录
                    gameRecord.append("游戏时间"+simpleDateFormat.format(new Date())+":\n共获得"+gamenum+"分\n");

                // 参数初始化
                    gamemark =0;
                    gamenum=0;
                    countNum.setText(gamenum+"");//初始分数
                    diglett.setIcon(null);
                }else{

                }

            }
        });
//      游戏结束按钮
        end.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(gamemark ==1){
                    JOptionPane.showMessageDialog(null, "游戏结束总得分："+gamenum, "游戏结束",JOptionPane.INFORMATION_MESSAGE);
                    //               游戏记录
                    gameRecord.append("游戏时间"+simpleDateFormat.format(new Date())+":\n共获得"+gamenum+"分\n");
                    // 参数初始化
                    gamemark =0;
                    gamenum=0;
                    countNum.setText(gamenum+"");//初始分数
                    diglett.setIcon(null);
                }else{

                }
            }
        });

    }


    public static void main(String[] args) {
      new MoleDemo().App();

    }
}
