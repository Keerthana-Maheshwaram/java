import java.util.*;
import java.util.Arrays;

public class Challenge {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number of integers you want to insert in an array: ");
        int number = scn.nextInt();
        int[] array = getIntegers(number);
        System.out.println("elements as they were inserted are:  ");
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("element " + i + ", assigned the value " + array[i]);
        }

        System.out.println("The elemnts sorted in descending order are: ");
        int[] sorted = sortIntegers(array);
        printArray(sorted);

    }

    public static int[] getIntegers(int num) {
        System.out.println("enter " + num + "integers ");
        int[] values = new int[num];
        for (int i = 0; i < values.length; i++) {
            values[i] = scn.nextInt();
        }
        return values;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element " + i + "contains " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        // int[] sortedArray = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     sortedArray[i] = arr[i];
        // }
        // instead of writing this big code to copy array to sorted array we can wrie it in 1 line as:
        int[] sortedArray=Arrays.copyOf(arr,arr.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}
