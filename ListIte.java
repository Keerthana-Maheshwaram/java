import java.util.*;


public class ListIte {
    public static void main(String[] args){

        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("jack");
        arrl.add("tom");
        arrl.add("nick");

        ListIterator<String> itr= arrl.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("  ");
        System.out.println("  ");

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
    
}
