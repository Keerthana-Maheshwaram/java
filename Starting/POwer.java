import java.util.*;

public class POwer {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        POwer p=new POwer();
        System.out.println("Enter the base num: ");
        int num=scn.nextInt();
        System.out.println("Enter the exponent: ");
        int exp=scn.nextInt();
        System.out.println("The power of "+ num + "is: "+ p.power(num,exp));
    }

    public int power(int base, int expo ){
        if(expo<0){
            return -1;
        }
        if(expo==0 || expo==1){
            return base;
        }
        return base * power(base, expo-1);
    }
    
}
