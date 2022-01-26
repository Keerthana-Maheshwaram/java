import java.util.*;

public class SumDigitChallenege {

    public static void main(String[] args) {
        
        System.out.println(sumDigits(125));   

        
}
private static int sumDigits(int n){
    
int sum=0;
    if(n<10){
        return -1;
    }
    while(n>0){
        int p=n%10;
        sum+=p;
        n=n/10;
        

    }
    return sum;
   
}


}
