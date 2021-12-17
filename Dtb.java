import java.util.*;



public class Dtb {

    
public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a num:");
    int a=scn.nextInt();

    Dtb obj=new Dtb();
    System.out.println(obj.dectoBin(a));

        
    }

    public int dectoBin(int a){
        if(a==0){
            return 0;
        }
        if(a<0){
            return -1;
        }
        return a%2 + 10*dectoBin(a/2);
    }
    
}
