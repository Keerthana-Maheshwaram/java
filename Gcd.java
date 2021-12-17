import java.util.*;

public class Gcd {

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first number");
        int m=scn.nextInt();
        
        System.out.println("Enter the second number");
        int n=scn.nextInt();
        
        Gcd obj=new Gcd();
        System.out.println(obj.gcd1(m,n));

        
    }

    public int gcd1(int m, int n){
        if(n==0){
            return m;
        }
        return gcd1(n,m%n);
    } 
    
}
