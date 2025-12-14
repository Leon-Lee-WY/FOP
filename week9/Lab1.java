package week9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args){
        String course;
        String x;
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            oos.writeUTF("WXES1116,Programming I");
            oos.writeUTF("WXES1115,Data Structure");
            oos.writeUTF("WXES1110,Operating System");
            oos.writeUTF("WXES1112,Computing Mathematics I");
            oos.close();}
        catch(FileNotFoundException e){
        }
        catch(IOException e){
        }
        
        try{
            String []line;
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("coursename.dat"));
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the course code: ");
            course=sc.nextLine();
            course=course.toUpperCase();
            
            if (course.equals("WXES1116")){
                x=ois.readUTF();
                line=x.split(",");
                System.out.println("The course name is: "+line[1]);
            }
            else if (course.equals("WXES1115")){
                ois.readUTF();
                x=ois.readUTF();
                line=x.split(",");
                System.out.println("The course name is: "+line[1]);
            }
            else if (course.equals("WXES1110")){
                ois.readUTF();
                ois.readUTF();
                x=ois.readUTF();
                line=x.split(",");
                System.out.println("The course name is: "+line[1]);
            }
            else if (course.equals("WXES1112")){
                ois.readUTF();
                ois.readUTF();
                ois.readUTF();
                x=ois.readUTF();
                line=x.split(",");
                System.out.println("The course name is: "+line[1]);
            }
            ois.close();
            sc.close();
        }
        catch(IOException e){}
    }
}
