package week6fop;
import java.util.Random;
public class Lab2 {
    public static void main(String[] args) {
        Random ran=new Random();
        int[]range={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[]finalarr=new int[10];
        int x;
        boolean repeat=true;
        
        for (int i=0;i<10;i++){
            while (repeat==true){
            x=ran.nextInt(21);
            for(int j=0;j<21;j++){
                while (x==range[j]){
                    finalarr[i]=x;
                    range[j]=30;
                    repeat=false;
                } 
            }
            finalarr[i]=x;
        }
            repeat=true;
        }
        for (int y=0;y<10;y++){
            System.out.println(finalarr[y]);
        }
    }
}
