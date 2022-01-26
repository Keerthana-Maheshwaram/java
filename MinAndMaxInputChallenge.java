import java.util.*;



public class MinAndMaxInputChallenge{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int min=0;
        int max=0;
        boolean first=true;

        // int min=2147483647;
        // int max=-2147483648;

        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;

        //instead of using boolean we can assign the min value to the
        //max integer int can hold and
        //assign the max value to the min int can hold
        //int min=
        //or we can just assign min=MAX_INTEGER

        while(true){

            System.out.println("Enter a num:");
            boolean isInt = scn.hasNextInt();
            if(isInt){
                int num=scn.nextInt();
                if(first){
                    first=false;
                    min=num;
                    max=num;

                }
                if(num>max){
                    max=num;
                }
                if(num<min){
                    min=num;
                }
                
            }else{
                System.out.println("Invalid input");
                break;
            }
            scn.nextLine();

        }
        System.out.println("min: "+min+" max: "+max);
        scn.close();

        
    }
}