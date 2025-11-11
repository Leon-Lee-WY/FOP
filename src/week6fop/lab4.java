package week6fop;
import java.util.Arrays;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
        int i,j,store;
        
        System.out.println("Enter your value for the array row by row:  ");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("3x3 Matrix");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        store=arr[0][0];
        arr[0][0]=arr[2][0];
        arr[2][0]=arr[2][2];
        arr[2][2]=arr[0][2];
        arr[0][2]=store;
        store=arr[0][1];
        arr[0][1]=arr[1][0];
        arr[1][0]=arr[2][1];
        arr[2][1]=arr[1][2];
        arr[1][2]=store;
        
        System.out.println("After rotates 90 degrees clockwise");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
