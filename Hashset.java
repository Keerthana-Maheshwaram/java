import java.util.*;

public class Hashset {
    
    public static void main(String[] args){
        HashSet<String> has= new HashSet<String>();
        has.add("jack");
        has.add("tom");
        has.add("nick");

        Iterator<String> itr= has.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
