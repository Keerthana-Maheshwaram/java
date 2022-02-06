import java.util.*;
import java.util.Arrays;

public class Project1 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter the length of the array: ");
        int num=scn.nextInt();
        System.out.println("Enter the target num: ");
        int target=scn.nextInt();
        int[] arr=getInt(num);
        int[] result=twoSum(arr,target);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] getInt(int number){
        System.out.println("Enter "+number +" integer values: ");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scn.nextInt();
        }
        return values;
    }


    public static int[] twoSum(int[] intArr,int target){
        for(int i=0;i<intArr.length;i++){
            for(int j=i+1;j<intArr.length;j++){
                if(intArr[i]+intArr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}
