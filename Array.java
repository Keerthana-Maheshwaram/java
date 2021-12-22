import java.util.*;
import java.util.Arrays;

public class Array {
    public static void main(String[]args){
        Array obj=new Array();
        int[] customArray={1,2,3,4,5,6};
        obj.reverse(customArray);
    }

    void reverse(int [] arrays){
        int n=arrays.length;
        int para=0;
        for(int i=0;i<n/2;i++){
            para=arrays[n/2-i-1];
            arrays[n/2-i-1]=arrays[i];
            arrays[i]=para;
        }
        System.out.println(Arrays.toString(arrays));    
        
        }
        
    }


