import java.util.*;

public class Recursion {

    public static void main(String[] agrs) {

        Recursion rec = new Recursion();
        int ans=rec.factorial(3);
        System.out.println(ans);

    }

    public int factorial(int num) {

        if (num < 0) {
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }

    }
}