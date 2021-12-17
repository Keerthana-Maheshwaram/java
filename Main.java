import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Main main = new Main();
        int n = scn.nextInt();

        var ans = sumofdigits(n);
        System.out.println(ans);
    }

    public static int sumofdigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumofdigits(n / 10);
    }

}
