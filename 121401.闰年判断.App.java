public static void main(String[] args) {
        /***
         * （1）若某个年份能被4整除但不能被100整除，则是闰年。
         * （2）若某个年份能被400整除，则也是闰年。
         */
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("请输入年份 【0】：退出系统");
            int i = sc.nextInt();
            if (i==0){
                System.out.println("系统已经退出！");
            }else{
                boolean mark = (i%4==0 && i%100!=0) || i%400==0 ? true : false;
                if (mark){
                    System.out.println(i+"年是闰年");
                }else{
                    System.err.println(i+"年不是闰年");
                }
            }
        }
    }
