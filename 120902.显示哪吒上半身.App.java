import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    // 矩阵
    int array2d[][]={
            {1,2,3},
            {4,5,6}
    };
    // 下标
    int cnt=0;
    // 图片宽高
    int cell=128;
    // 构造方法
    public App() {
        for (int i = 0; i <=6; i++) {
            // 添加元素
            label_list.add(new JLabel());
            // 拼接图片
            java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            // 元素加入图片
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                // 获取矩阵对应元素并设置位置和大小
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                // 把元素添加到面板中
                myPanel.add(label_list.get(cnt));
                cnt++;
            }
        }



    }
    //显示窗体方法
    void go(){
        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("哪吒上半身");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
