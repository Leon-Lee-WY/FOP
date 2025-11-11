package week6fop;
import java.util.Random;
import java.util.Scanner;
public class Week6FOP {
    public static void main(String[] args) {
       Random ran=new Random();
       Scanner sc=new Scanner(System.in);
       int N,i;
       int high=-1;
       int low=101;
       double sum=0;
       double av;
       System.out.print("Enter the number of students: ");
       N=sc.nextInt();
       int [] scores=new int[N];
        
        for(i=0;i<N-1;i++){
            scores[i]=ran.nextInt(101);
            System.out.print(scores[i]+", ");
            sum=sum+scores[i];
            if (scores[i]>high){
                high=scores[i];
            }
            if (scores[i]<low){
                low=scores[i];
            }
        }
        scores[N-1]=ran.nextInt(101);
        System.out.println(scores[N-1]);
        sum=sum+scores[N-1];
        if (scores[N-1]>high){
            high=scores[N-1];
        }
        if (scores[N-1]<low){
            low=scores[N-1];
        }
        av=sum/N;
        System.out.println("The highest score: "+high);
        System.out.println("The lowest score: "+low);
        System.out.printf("The average score: %.2f%n",av);
    } 
}