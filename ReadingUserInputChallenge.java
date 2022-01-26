import java.util.*;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 1;
        int sum = 0;

       
        if (true) {

            for (count = 1; count <= 10; count++) {
                System.out.println("Enter number #"+count+ " : ");
                boolean enteredint = scn.hasNextInt();
                if(enteredint){
                    int num = scn.nextInt();
                System.out.println("the entered num " + count + " is " + num);
                System.out.println("Enter next num: ");
                sum += num;
                }
                else {
                    System.out.println("invalid number");
                

            }
            

        } 
    }
    System.out.println("the sum of 10 numbers is : " + sum);
        scn.close();

    }

}
