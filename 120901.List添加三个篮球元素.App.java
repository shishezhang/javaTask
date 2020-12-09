import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Appdemo {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> jLabelList = new ArrayList<>();
    //构造方法
    public Appdemo() {

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = Appdemo.class.getResource("img/ball.png");
        jLabelList.add(new JLabel());
        jLabelList.add(new JLabel());
        jLabelList.add(new JLabel());
        jLabelList.get(0).setIcon(new ImageIcon(imgURL));
        jLabelList.get(1).setIcon(new ImageIcon(imgURL));
        jLabelList.get(2).setIcon(new ImageIcon(imgURL));
        jLabelList.get(0).setBounds(0,0,64,64);
        jLabelList.get(1).setBounds(64,0,64,64);
        jLabelList.get(2).setBounds(128,0,64,64);

        myPanel.add(jLabelList.get(0));
        myPanel.add(jLabelList.get(1));
        myPanel.add(jLabelList.get(2));
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Appdemo().go();
    }
}
