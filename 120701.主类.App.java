public class DemoMain {
    public static void main(String[] args) {
        int [][]array2d={
                {1,2,3,4,5},
                {7,8,9,1,1,0},
                {7,8,9,10,11,12},
                {7,8,9,10,11,12,9},
                {88,66,92,102,151,67}
        };
        new Find().findZero(array2d);
        new Find().findLeft(array2d);
        new Find().findRight(array2d);
        new Find().findUp(array2d);
        new Find().findDown(array2d);

    }
}

//輸出解析
R_zero（1,5)
R_left（1,4)
R_right（0,0)
R_up（0,0)   --不存在  array2d[0][5] ,所以也是（0，0）
R_Down（2,5)
