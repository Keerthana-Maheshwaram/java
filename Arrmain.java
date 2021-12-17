public class Arrmain {
    public static void main(String[]args){
        SingleDimensionArray sda= new SingleDimensionArray(10);
        sda.insert(0,1);
        sda.insert(1,4);
        sda.insert(9,25);
        
        System.out.println(sda.arr[0]);
        System.out.println(sda.arr[9]);

        System.out.println("Array Traversal");
        sda.ArrayTraversal();
    }
    
}
