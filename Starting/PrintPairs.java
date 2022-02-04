import java.util.*;

public class PrintPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PrintPairs p = new PrintPairs();
        System.out.println("enter the length of the array: ");
        int length = scn.nextInt();
        int[] arr = new int[length];
        System.out.println("enter an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        p.printPairsOfArray(arr);

    }

    public void printPairsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}

// https://forms.gle/Hjf5F1YkPiQQHBSq9