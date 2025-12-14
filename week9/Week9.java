package week9;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class Week9 {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand=new Random();
        int []num=new int[10];
        PrintWriter pw=new PrintWriter("integer.txt");
        for (int i=0;i<10;i++){
            num[i]=rand.nextInt(1001);
            pw.println(num[i]);
        }
        pw.close();
    }
}