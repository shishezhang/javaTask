
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainDemo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean whileb = true;
        while (whileb){
            System.out.println("输入1：【获取随机坐标】，输入0：【退出程序】");
            String s = sc.next();
            if(s.equals("1")){
                int x  = (int) (Math.random() * 100);
                int y  = (int) (Math.random() * 100);
                List R = new ArrayList();
                R.add(x);
                R.add(y);
                System.out.println("随机坐标："+R);
            }else if(s.equals("0")){
                System.out.println("程序结束！");
                whileb = false;
            }else{
                System.out.println("输入错误，请重新输入！");
            }

        }
    }

}
 
