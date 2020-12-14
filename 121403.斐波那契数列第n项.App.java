public class Demo {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        while (b){
            System.out.println("请输入一个数1-40的数 【0】退出系统");
            int i = sc.nextInt();
            System.out.println(F(i));
        }
    }
    static int F(int n){
        //斐波那契数列1 1 2时返回的数
        if(n <= 2){
            return 1;
        }else{
            return F(n - 1) + F(n - 2);
        }
    }
}
