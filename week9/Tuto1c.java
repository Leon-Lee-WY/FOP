package week9;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
public class Tuto1c {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("integer.dat"));
        Random rand=new Random();
        for(int i=0;i<10;i++){
            int num=rand.nextInt(1001);
            oos.writeInt(num);
        }
        oos.close();
    }
}
