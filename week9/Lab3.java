package week9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\lwylw\\OneDrive\\Documents\\NetBeansProjects\\Week9\\Lab3normal.txt");
        try{
            PrintWriter pw=new PrintWriter(file);
            pw.println("You'll float too");
            pw.println("Welcome to Derry");
            pw.println("Ching chong bing bong");
            pw.close();
            
            PrintWriter pwr=new PrintWriter("reverse.txt");
            String[]arr=new String[1];
            Scanner fs=new Scanner(file);
            while(fs.hasNextLine()){
                arr[0]=fs.nextLine();
                for(int i=arr[0].length()-1;i>=0;i--){
                    pwr.print(arr[0].charAt(i));
                }
                pwr.println("");
            }
            fs.close();
            pwr.close();
        }
        catch(FileNotFoundException e){}
    }
}
