package week6fop;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Random ran=new Random();
        int N,i,x;
        int sum;
        int sumall=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employees number: ");
        N=sc.nextInt();
        int[][]employees=new int[N][7];
        
        System.out.println("\t\t     WORKHOUR\t\t TOTAL");
        for(x=0;x<N;x++){
            sum=0;
            System.out.print("Employee "+(x+1)+": ");
            for(i=0;i<7;i++){
            employees[x][i]=ran.nextInt(8)+1;
            System.out.print(employees [x][i]+"   ");
            sum=sum+employees[x][i];
            }
            System.out.println(sum);
        }
    }
}
