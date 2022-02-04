import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        System.out.println(decimalToBimary(162));
        
        
    }

    public static int decimalToBimary(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%2 + 10*decimalToBimary(n/2); // n%2 gives the remainder
    }
}
