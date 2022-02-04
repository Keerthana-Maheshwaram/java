import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Gcd g=new Gcd();
        System.out.println("Enter 1st num: ");
        int num1=scn.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2=scn.nextInt();
        System.out.println("GCD of 2 numbers is: "+ g.gcd(num1, num2));

        

    }

    public int gcd(int a,int b){
        if(b==0 || a==b){
            return a;
        }
        if(a==0){
            return b;
        }
        return gcd(b, (a%b));
    }
    
}
