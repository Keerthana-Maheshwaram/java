import java.util.*;
import java.util.Arrays;

public class Project3 {
    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int num=scn.nextInt();
        int[] Arr=getInt(num);
        System.out.println(isUnique(Arr));
    }

    public static int[] getInt(int number){
        System.out.println("Enter the array elements: ");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scn.nextInt();
        }
        return values;
    }

    public static boolean isUnique(int[] Array){
        for(int i=0;i<Array.length;i++){
            for(int j=1;j<Array.length;j++){
                if(Array[i]==Array[j]){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    }
}
