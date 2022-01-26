import java.util.*;


public class Linkedlist {
    public static void main(String[]args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("jack");
        ll.add("tom");
        ll.add("nick");
        ll.addFirst("jim"); //adds an element at the top of the list
        ll.addLast("roxy"); //adds an element at the bottom of the list
        ll.add(3,"kim"); //adds an element at the index 3
        ll.remove(0);//remove element at 0 index
        

        for(String x : ll ){
            System.out.println(x);
        }
    }
    
}
