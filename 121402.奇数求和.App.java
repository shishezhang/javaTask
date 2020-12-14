public static void main(String[] args) {

        long start = 1;
        long end = Integer.MAX_VALUE;
        // TODO: 2020/12/14 公式：（首项+末项）*项数/2 
        long count= (start+end)*(end/2+1)/2;
        System.out.println("0~最大整数的奇数和为："+count);

    }
