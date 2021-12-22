import java.util.*;
import java.util.Arrays;

public class prac {
    
    int arr[];

    public prac(int index){
        arr=new int[index];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int loc, int value){
        if(arr[loc]==Integer.MIN_VALUE){
            arr[loc]=value;
            System.out.println("inderted");
        }
    }

    public void arraytraversal(){
        for(int i=0;i<arr.length;i++){
            System.out.println("");
        } 
    }
}
