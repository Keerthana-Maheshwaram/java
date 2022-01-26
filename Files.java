import java.io.*;

public class Files {

    public static void main(String[] args) { //ctrl+space n select 1st one
        try{
            File file=new File("myfile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

        
        PrintWriter pw=new PrintWriter(file);
        pw.println("this is my file content");
        pw.println(10000);
        pw.print(9006);

        pw.close();
        System.out.println("done");

        }
        catch(IOException e){
            e.printStackTrace();
        }
        

        
        
    }
    
}
