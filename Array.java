import java.util.*;
import java.util.Arrays;

public class Array {
    public static void main(String[]args){
        Array obj=new Array();
        int[] customArray={1,2,3,4,5,6};
        obj.reverse(customArray);
    }

    void reverse(int [] arrays){
        for(int i=0;i<arrays.length/2;i++){
            int other=arrays.length-i-1;
            int temp=arrays[i];
            arrays[i]=arrays[other];
            arrays[other]=temp;
        }
        System.out.println(Arrays.toString(arrays));    
        
        }
        
    }
    

