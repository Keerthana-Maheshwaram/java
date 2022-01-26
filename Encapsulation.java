import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {
        Variable var = new Variable();
        // var.i = 7;
        // System.out.println(var.i);

        var.setVar(8);
        System.out.println(var.getVar());
    }
}

class Variable {
    private int i;

    public void setVar(int i){
        this.i=i;
    }

    public int getVar(){
        return i;
    }
}
