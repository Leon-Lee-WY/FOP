package week10;
import java.util.Scanner;
public class Payment {
    Scanner sc=new Scanner(System.in);
    String method;
    Payment(String method){
        this.method=method;
    }
    
    
    public void paymentMethod(int amount){
        if(!this.method.equals("cash")){
            System.out.println("Invalid input");
        }
        else{
        System.out.println("Cash Amount: RM"+amount);}
    }
    
    public void paymentMethod(int amount,int chequenum){
        if(!this.method.equals("bank")){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Cheque Amount: RM"+amount);
            System.out.println("Cheque Number: "+chequenum);
        }
    }
    
    public void paymentMethod(int amount,String name,String type,String date,int code){
        if(!this.method.equals("credit card")){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Cheque Amount: RM"+amount);
            System.out.println("Card Holder's Name: "+name);
            System.out.println("Card Type: "+type);
            System.out.println("Expiration Date: "+date);
            System.out.println("Validation Code: "+code);
        }
    }
}
