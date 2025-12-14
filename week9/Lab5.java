package week9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
public class Lab5 {
    public static void main(String[] args) {
        try{
            File file=new File("person.dat");
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            int x=ois.readInt();
            String fullgen;
            String[]store=new String[x];
            for(int i=0;i<x;i++){
                String name=ois.readUTF();
                int age=ois.readInt();
                char gender=ois.readChar();
                if(gender=='M'){
                    fullgen="Male";
                }
                else{
                    fullgen="Female";
                }
                store[i]=name+ " "+age+" "+fullgen;
            }
            Arrays.sort(store);
            for(int i=0;i<x;i++){
                System.out.println(store[i]);
            }
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
    }
}
