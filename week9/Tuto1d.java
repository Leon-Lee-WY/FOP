package week9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Tuto1d {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("integer.dat"));
        int sum=0;
        int av;
        int[]num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=ois.readInt();
            System.out.println(num[i]);
        }
        
        for(int i=0;i<10;i++){
            sum=sum+num[i];
        }
        av=sum/10;
        System.out.println("The average of the numbers: "+av);
        ois.close();
    }
}
