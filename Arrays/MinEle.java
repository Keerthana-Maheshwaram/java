import java.util.*;
import java.util.Arrays;


public class MinEle {

    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the num of integers to insert in an array: ");
        int number=scn.nextInt();
        int[] arr=getInt(number);
        for(int i=0;i<arr.length;i++){
            System.out.println("element "+ i+ "contains: "+ arr[i]);
        }

        System.out.println("min element: "+ minElement(arr));

    }

    public static int[] getInt(int num){
        System.out.println("enter " + num + "integers ");
        int[] array=new int[num];
        for(int i=0;i<array.length;i++){
            array[i]=scn.nextInt();
        }
        return array;

    }

    public static int minElement(int[] arr){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            if(value<min){
                min=value;
            }

        }
        return min;
    }
    
}
