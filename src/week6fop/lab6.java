package week6fop;
import java.util.Arrays;
import java.util.Scanner;
public class lab6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,x,y;
        System.out.print("Enter the row of Pascal Triangle to generate: ");
        i=sc.nextInt();
        int [][] pt=new int[i][i];
        
        pt[0][0]=1;
        for(y=1;y<i;y++){
            pt[0][y]=0;}
        
        for(x=1;x<i;x++){
            pt[x][0]=1;
            for(y=1;y<i;y++){
                pt[x][y]=pt[x-1][y-1]+pt[x-1][y];
            }
        }
        System.out.println("The Pascal Triangle with "+i+" rows");
        for(x=0;x<i;x++){
            for(y=0;y<i;y++){
                System.out.printf("%3d ",pt[x][y]);
            }
            System.out.println("");
        }
    }
}
