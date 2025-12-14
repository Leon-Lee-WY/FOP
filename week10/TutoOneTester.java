package week10;
import java.util.Scanner;
public class TutoOneTester {
    public static void main(String[] args) {
       Student s1=new Student("0129999999"); //1.g
       s1.setContact("0179893838");
       
       Animal a=new Animal(); //1.i
       Animal cat=new Animal(); //1.j
       
       Number num=new Number(20,40); //1.k
       
       Payment pay=new Payment("credit card");
       pay.paymentMethod(900,"Lee Wuey Yong","Visa","06-06-2027",398);
       
       Connection c1=new Connection("WAP");
       Connection c2=new Connection("Router");
       Connection c3=new Connection("Computer");
       Connection c4=new Connection("CPU");
       
       c3.disconnect();
       c2.disconnect();
       c2.disconnect();
       Connection.display();
    }
}
