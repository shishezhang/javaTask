 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("请输入年份 【0】：退出系统");
            int i = sc.nextInt();
            if (i==0){
                System.out.println("系统已经退出！");
            }else{
                if(i>0){
                    boolean mark = (i%4==0 && i%100!=0) || i%400==0 ? true : false;
                    if (mark){
                        System.out.println("公元"+i+"年是闰年");
                    }else{
                        System.err.println("公元"+i+"年不是闰年");
                    }
                }else{
                    boolean mark = Math.abs(i)%4==1 || Math.abs(i)%400==1 ? true : false;
                    if (mark){
                        System.out.println("公元前"+i+"年是闰年");
                    }else{
                        System.err.println("公元前"+i+"年不是闰年");
                    }
                }

            }
        }
    }
