import java.util.ArrayList;
import java.util.List;
public class mainDemo {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            int x  = (int) (Math.random() * 100);
            int y  = (int) (Math.random() * 100);
            List R = new ArrayList();
            R.add(x);
            R.add(y);
            System.out.println("随机坐标："+R);
        }
    }
}
