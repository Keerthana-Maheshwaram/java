import java.util.*;
import java.util.ArrayList;

public class Intarray{
    public static void main(String[] args){
         
         ArrayList<Integer> arr=new ArrayList<Integer>(3);
         arr.add(1);
         arr.add(9);
         arr.add(2);
         arr.add(4);
         arr.add(6);
         arr.add(8);

         for(Integer x : arr ){
         System.out.println(x);
        }
        System.out.println("Size: " + arr.size());
        arr.remove(3);//remove element in index 3
        arr.set(0,100);
        

        for(Integer x : arr ){
            System.out.println(x);
        }
        
    }
}