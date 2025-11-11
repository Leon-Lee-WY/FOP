package week6fop;
import java.util.Random;
import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Random ran=new Random(); 
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[20];
        int i,num;
        int store;
        int loop=0;
        boolean found=false;
        for (i=0;i<19;i++){
            arr[i]=ran.nextInt(101);
            System.out.print(arr[i]+", ");
        }
        arr[19]=ran.nextInt(101);
        System.out.println(arr[19]);
        
        
        for (int x=0;x<arr.length;x++){
            for(int y=0;y<arr.length-x-1;y++){
                if(arr[y]<arr[y+1]){
                    store=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=store;
                }
            }
        }
        
        for (i=0;i<19;i++){
                System.out.print(arr[i]+", ");
            }
            System.out.println(arr[19]); 
            
        System.out.print("Enter the number to search: ");
        num=sc.nextInt();
        
        for(i=0;i<20;i++){
            if (arr[i]==num&&found==false){
                found=true;
                loop=i;
            }
        }
        
        
        if(found==true){
        System.out.println(num+" found");
        System.out.println("Linear search - "+loop+" loops");
        }
        else{
            System.out.println(num+" not found");
        }
    }
}
