import java.util.*;
import java.util.Arrays;

public class Project {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many days of temperature: ");// taking the length of array input
        int num = scn.nextInt();
        int arr[] = gettemp(num);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average;
        average = (double) (sum / arr.length);
        System.out.println("Average: " + average);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println(count + "day's temp is above average");

    }

    public static int[] gettemp(int number) {
        int[] temp = new int[number];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Day " + (i + 1) + "'s highest temp: ");
            temp[i] = scn.nextInt();
        }
        return temp;
    }
}
