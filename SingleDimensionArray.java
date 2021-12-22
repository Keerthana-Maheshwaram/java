import java.util.*;
import java.util.Arrays;

public class SingleDimensionArray {
   int arr[]=null;
   
   public SingleDimensionArray(int sizeofarray){
       arr=new int[sizeofarray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
   }

   public void insert(int location, int valuetobeinserted){
       try{
           if (arr[location]==Integer.MIN_VALUE){
               arr[location]=valuetobeinserted;
               System.out.println("successfully inserted");
           }else{
               System.out.println("this cell is already occupied");
           }
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("invalid index to access array!");
       }
   }

   public void ArrayTraversal(){
       try{
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+ " ");
           }
       }catch(Exception e){
           System.out.println("Array no lonnger exists!");
       }
   }

   public void SearchInArray(int valuetosearch){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==valuetosearch){
               System.out.println("Value is found at index"+ i);
               return;
           }
       }
      
       System.out.println(valuetosearch + "is not found");
   }

   public void deleteValue(int indexToDelete){
       try{
           arr[indexToDelete]=Integer.MIN_VALUE;
           System.out.println("the value has been deletred");
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("the value provided is not in range");
       }
   }


}
