import java.util.*;

public class Seconds {

    public static void main(String[] args) {
        System.out.println(getDurationString(88, 5) );
        System.out.println(getDurationString(106));
        
    }


    public static String getDurationString(int min, int sec){
        if(min<0 || sec<0 || sec>59){
            //System.out.println("invalid parameters");
            return "invalid parameters";
        }

        else{
            int hours = min/60;
            int mins=min%60;

            return (hours + "h "+ mins +"m " + sec + "s ");
        }

    }

    public static String getDurationString(int sec){
        int mins=sec/60;
        float secs=(sec%60)/100f;
        float total = (mins + secs) ;
        System.out.println("mins " + mins);
        System.out.println("secs " + secs);
        return (total + "m ");
    }
    
}
