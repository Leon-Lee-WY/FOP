package lab1;
public class money {
    double x;
    int n100,n50,n10,n5,n1,n050,n020,n010,n005;
    static double addBoth=0;
    static double subtractBoth=0;
    
    money(double x){
        this.x=x;
    }
    
    public double roundUp(){
        System.out.println("Total: RM"+x);
        double last=((x*10)-(int)(x*10))/10;
        if(last>=0.01&&last<=0.04){
            x=((double)((int)(x*10)))/10;
        }
        else if(last>=0.06&&last<=0.09){
            x=((double)((int)(x*10))+1)/10;
        }
        System.out.println("Total after rounding: RM"+x);
        
        n100=(int)(x/100);
        n50=(int)((x-(n100*100))/50);
        n10=(int)((x-(n100*100)-(n50*50))/20);
        n5=(int)((x-(n100*100)-(n50*50)-(n10*10))/5);
        n1=(int)((x-(n100*100)-(n50*50)-(n10*10)-(n5*5))/1);
        n050=(int)((x-(n100*100)-(n50*50)-(n10*10)-(n5*5)-(n1))/0.5);
        n020=(int)((x-(n100*100)-(n50*50)-(n10*10)-(n5*5)-(n1)-(n050*0.5))/0.2);
        n010=(int)((x-(n100*100)-(n50*50)-(n10*10)-(n5*5)-(n1)-(n050*0.5)-(n020*0.2))/0.1);
        n005=(int)((x-(n100*100)-(n50*50)-(n10*10)-(n5*5)-(n1)-(n050*0.5)-(n020*0.2)-(n010*0.1))/0.05);
        System.out.println(n100+" RM100, "+n50+" RM50, "+n10+" RM10, "+n5+" RM5, "+n1+" RM1, "+n050+" 0.5cents, "+n020+" 0.2cents, "+n010+" 0.1cents, and"+n005+" 0.05cents.");
        return x;
    }
    
    public static void add(double a,double b){
        addBoth=a+b;
        System.out.printf("Total after adding both: RM%.2f%n",addBoth);
    }
    
    public static void subtract(double a,double b){
        if(a>b){
           subtractBoth=a-b; 
            System.out.printf("Total after subtraction: RM%.2f%n",subtractBoth);
        }
        else if(a<b){
            System.out.println("Second total is less than first total. Invalid subtraction.");
        }
        else if(a==b){
            System.out.println("Total after subtraction: RM0");
        }
    }
}
