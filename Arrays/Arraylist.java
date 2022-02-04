import java.util.*;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Double> arrayName=new ArrayList<Double>();
        for(double d=0.0; d<=20; d++){
            arrayName.add(Double.valueOf(d));
        }

        for(int i=0; i<arrayName.size(); i++){
            //double value=arrayName.get(i);
            double value=arrayName.get(i).doubleValue();
            //the above two statements gives the sAAAME RESULTS
            System.out.println(i + " " + value);
        }
    }
}
