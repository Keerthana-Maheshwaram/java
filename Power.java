import java.util.*;



public class Power {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        System.out.println("Enter the base:");
        int exp=scn.nextInt();
        System.out.println("Enter the power:");
        Power obj=new Power();
        int ans=obj.powers(base,exp);
        System.out.println(ans);
    
    }

    public int powers(int base, int exp){
        if(exp<0){
            return -1;
        }
        if(exp==0|| exp==1){
            return base;
        }
        return base*powers(base,exp-1);
    }
    
}
