import java.util.*;
import java.util.Arrays;


public class TwoDarray {
    int arr[][]=null;

    public TwoDarray(int noofrows, int noofcol){
        arr=new int[noofrows][noofcol];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }


    public void insert(int row, int col, int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
            }
        }
    }
    
}


