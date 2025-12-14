package week9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tuto1b {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("integer.txt");
        Scanner fs=new Scanner(file);
        int []num=new int[10];
        int i=0;
        int max=-1;
        
        while(fs.hasNextInt()){
            num[i]=fs.nextInt();
            System.out.println(num[i]);
            i=i+1;
        }
        
        for (i=0;i<9;i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        fs.close();
        System.out.println("Largest number is: "+max);
    }
}

