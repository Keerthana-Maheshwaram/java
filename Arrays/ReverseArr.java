import java.util.*;
import java.util.Arrays;

public class ReverseArr {
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the num of integers in an array ");
        int num=scn.nextInt();
        int[] array=getInt(num);
        printEle(array);
        reverseArr(array);
        System.out.println("reversed array: ");
        printEle(array);


    }

    public static int[] getInt(int number){
        System.out.println("enter" + number + "integers in an array: " );
        int[] arr=new int[number];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }

    public static void printEle(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("element " +i+"contains: "+ array[i]);
        }
    }

    public static void reverseArr(int[] array){
        int temp;
        int n=array.length;
        for(int i=0;i<n/2;i++){
            temp=array[i];
            array[i]=array[n-1];
            array[n-1]=temp;

        }

    }
    
}
