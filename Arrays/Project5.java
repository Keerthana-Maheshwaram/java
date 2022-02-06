import java.util.*;
import java.util.Arrays;

public class Project5 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int length = scn.nextInt();
        int[] arr = getInt(length);
        int[] result = maxProduct(arr);
        
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] getInt(int number) {
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scn.nextInt();
        }
        return values;

    }

    public static int[] maxProduct(int[] Array) {
        int i=0,j=0;

        int maxPro = 0;

        for (int k=0; k < Array.length; k++) {
            for (int s = 1; s < Array.length; s++) {
                if (Array[k] * Array[s] > maxPro) {
                    maxPro = Array[k] * Array[s];
                    i=k;
                    j=s;
                }

            }
        }
        return new int[] {i, j};
    }

}
