package week9;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;
public class Lab2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter pw=new PrintWriter("index.htm");
            while(in.hasNextLine()){
                pw.println(in.nextLine());
            }
            in.close();
        }
        catch (IOException e) {
        System.out.println("IO Error:" + e.getMessage());
        }
        
    }
}
