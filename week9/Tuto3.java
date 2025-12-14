package week9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Tuto3 {
    public static void main(String[] args){
        //sentence to binary
        try{
            PrintWriter pw=new PrintWriter("data.txt");
            Scanner sc=new Scanner(System.in);
            String sentence;
            char character;
            int i;
            System.out.print("Enter a sentence: ");
            sentence=sc.nextLine();

            for(i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==' '){
                    pw.print("00100000 ");
                }
                else{
                    character=sentence.charAt(i);
                    String binary=String.format("%8s",Integer.toBinaryString(character)).replace(' ', '0');
                    pw.print(binary+" ");}

            }
            pw.close();
            sc.close();}
        catch(FileNotFoundException e){}
        
        //binary to sentence
        try{
            File file=new File("data.txt");
            Scanner fs=new Scanner(file);
            String binsen=fs.nextLine();
            String [] banana=binsen.split(" ");
            System.out.print("Your sentence from binary is: ");
            for(String x:banana){
                System.out.print((char)Integer.parseInt(x,2));
            }
            fs.close();}
        catch(FileNotFoundException e){}
        System.out.println("");
    }
}
