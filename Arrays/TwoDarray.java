import java.util.*;
import java.util.Arrays;

public class TwoDarray {

    int arr[][] = null;
    public static void main(String[] args) {
        
        TwoDarray tda = new TwoDarray(3, 4);
        tda.insert(1, 2, 4);
        System.out.println(Arrays.deepToString(tda.arr));

    }

    public TwoDarray(int noofrows, int noofcol) {
        this.arr = new int[noofrows][noofcol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("the value is succcessfully inserted");
            }
            else{
                System.out.println("this cell is already filled");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index for 2D array");
        }
    }

}
