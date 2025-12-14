package week9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        try{
            File file=new File("Lab4things.txt");
            PrintWriter pw=new PrintWriter(file);
            pw.println("Jawn Pawk");
            pw.println("Rizzler Jonkler");
            pw.close();
            
            int lines=0;
            int characters=0;
            int words=0;
            Scanner fs=new Scanner(file);
            while(fs.hasNextLine()){
                fs.nextLine();
                lines=lines+1;
            }
            fs.close();
            
            fs=new Scanner(file);
            int countw=0;
            for(int i=0;i<lines;i++){
               String x=fs.nextLine();
               for (int j=0;j<x.length();j++){
                   characters=characters+1;
               }
               String[]storew=x.split(" ");
               countw=countw+storew.length;
            }
            fs.close();
            System.out.println("Characters: "+characters);
            System.out.println("Word count: "+countw);
            System.out.println("Lines: "+lines);
        }
        catch(FileNotFoundException e){}
    }
}
