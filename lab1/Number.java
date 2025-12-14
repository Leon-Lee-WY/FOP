package lab1;
import java.util.Random;
public class Number {
    Random rand=new Random();
    int i;
    int random;
    int []randomNum;
    
    Number(){
        this.i=10;
        this.random=100;
        this.randomNum=new int[this.i];
    }
    Number(int i){
        this.i=i;
        this.random=100;
        this.randomNum=new int[this.i];
    }
    Number(int i,int random){
        this.i=i;
        this.random=random;
        this.randomNum=new int[this.i];
    }
    public void displayNum(){
        System.out.print("Your numbers: ");
        for(int x=0;x<this.i;x++){
            randomNum[x]=rand.nextInt(this.random+1);
            System.out.print(randomNum[x]+" ");
            }
        System.out.println("");
        }
    public void displayEven(){
        System.out.print("Even numbers: ");
        for(int x=0;x<this.i;x++){
            if(randomNum[x]%2==0){
                System.out.print(randomNum[x]+" ");
            }
        }
        System.out.println("");
    }
    public void displayPrime(){
        boolean prime;
        System.out.print("Prime numbers: ");
        int n;
        for(int x=0;x<this.i;x++){
            prime=true;
            n=2;
            while(n<randomNum[x]){
                if(randomNum[x]%n==0){
                    prime=false;
                }
                n+=1;
            }
            if(prime==true){
                System.out.print(randomNum[x]+" ");
            }
        }
        System.out.println("");
    }
    public void findMinMax(){
        int min=randomNum[0];
        int max=randomNum[0];
        for(int x=1;x<this.i;x++){
            if(randomNum[x]>max){
                max=randomNum[x];
            }
            if(randomNum[x]<min){
                min=randomNum[x];
            }
        }
        System.out.println("Minimum number: "+min);
        System.out.println("Maximum number: "+max);
    }
    public void displayAV(){
        double sum=0;
        double av;
        for(int x=0;x<this.i;x++){
            sum=sum+randomNum[x];
        }
        av=sum/(double)this.i;
        System.out.println("Average: "+av);
    }
    public void displaySquare(){
        System.out.print("The squared numbers: ");
        double square;
        for(int x=0;x<this.i;x++){
            square=Math.pow(randomNum[x], 2);
            System.out.print(square+" ");
        }
        System.out.println("");
    }
}
