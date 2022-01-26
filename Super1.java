import java.util.*;


public class Super1 {

    public static void main(String[] args) {

        Jaws objj = new Jaws();

        
        
    }
}

class Movie{
    private String name;

    public Movie(String n){
        
        System.out.println(n);



    }

    public Movie(){
        System.out.println("hello");
    }


}


class Jaws extends Movie{

    public Jaws(){
        // super();
        super("jaws");
    System.out.println("hi");;
    }
}


