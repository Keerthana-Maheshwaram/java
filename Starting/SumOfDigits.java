import java.net.SocketPermission;
import java.util.*;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        SumOfDigits sod = new SumOfDigits();
        System.out.println("Enter the number: ");
        int num=scn.nextInt();
        System.out.println("Sum of digits of the number is: " + sod.sumDigits(num)); 

    }

    public int sumDigits(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }
    
}
