package week9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        try{
            File filea=new File("C:\\Users\\lwylw\\OneDrive\\Documents\\NetBeansProjects\\Week9\\order.txt");
            File fileb=new File("C:\\Users\\lwylw\\OneDrive\\Documents\\NetBeansProjects\\Week9\\product.txt");
            Scanner fsa=new Scanner(filea);
            System.out.println("ProductID   ProductName        Quantity    PricePerUnit    Total");
            
            for(int i=0;i<5;i++){
                double total=0;
                double price=0;
                String productname="Lim";
                String x=fsa.nextLine();
                String[]storea=x.split(",");
                int quantity=Integer.parseInt(storea[2]);
                Scanner fsb=new Scanner(fileb);
                for(int j=0;j<7;j++){
                    String y=fsb.nextLine();
                    String[]storeb=y.split(",");
                    if(storea[1].equals(storeb[0])){
                        productname=storeb[1];
                        price=Double.parseDouble(storeb[2]);
                        total=price*quantity;}
                    }
                fsb.close();
                System.out.printf("%s       %-20s  %-10s  %-11.2f  %.2f",storea[1],productname,quantity,price,total);
                System.out.println("");
                }
            fsa.close();
            }
        catch (FileNotFoundException e){}
    }
}
