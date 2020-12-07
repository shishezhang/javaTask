public class Find {
    public void findZero(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int r = row;
                    int c = column;
                    System.out.println("R_zero（"+r+","+c+")");
                }
            }
        }
    }
    public void findLeft(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int r = column-1<0 ? 0 : row;
                    int c = column-1<0 ? 0 : column-1;
                    System.out.println("R_left（"+r+","+c+")");
                }
            }
        }
    }
    public void findRight(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int r = column+1>=arr[row].length ? 0 : row;
                    int c = column+1>=arr[row].length ? 0 : column+1;
                    System.out.println("R_right（"+r+","+c+")");
                }
            }
        }
    }
    public void findUp(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int r = row-1<0 ? 0 : row-1;
                    int c = row-1<0 ? 0 : column;
                    try{
                        // TODO: 2020/12/7  若能取到即證明有值，否則行和列則是0
                        int item = arr[r][c];
                    }catch (Exception e){
                        r = 0;
                        c = 0;
                    }
                    System.out.println("R_up（"+r+","+c+")");
                }
            }
        }
    }
    public void findDown(int arr[][]){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if(arr[row][column] == 0){
                    int r = row+1>=arr.length ? 0 : row+1;
                    int c = row+1>=arr.length ? 0 : column;
                    try{
                        // TODO: 2020/12/7  若能取到即證明有值，否則行和列則是0
                        int item = arr[r][c];
                    }catch (Exception e){
                        r = 0;
                        c = 0;
                    }
                    System.out.println("R_Down（"+r+","+c+")");
                }
            }
        }
    }

}
