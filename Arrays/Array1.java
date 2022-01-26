import java.util.*;
import java.util.ArrayList;

public class Array1 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of numbers in an array: ");
        int num = scn.nextInt();
        int[] array = getInt(num);
        for(int i=0;i<array.length;i++){
            System.out.println("element "+ i+ " ,assigned value is "+ array[i]);
        }

    }

    public static int[] getInt(int number) {
        System.out.println("enter " + number + "integer values \n");
        int[] values=new int[number];
        for(int i=0; i<values.length; i++){
            values[i]= scn.nextInt();
        }
        return values;
    }

}
