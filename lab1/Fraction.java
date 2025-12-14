package lab1;
public class Fraction {
    int numerator;
    int denominator;
    
    public void input(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void setnumerator(int numerator){
        this.numerator=numerator;
    }
    public void setdenominator(int denominator){
        this.denominator=denominator;
    }
    public int getnumerator(){
        return this.numerator;
    }
    public int getdenominator(int denominator){
        return this.denominator;
    }
    public void displayLowestTerm(){
        int low=1;
        if(this.numerator>this.denominator){
            for(int x=2;x<this.numerator;x++){
                if(this.numerator%x==0&&this.denominator%x==0){
                    low=x;
                }
            }
            this.numerator=this.numerator/low;
            this.denominator=this.denominator/low;
            if(this.denominator==1){
                System.out.println(this.numerator);
            }
            else{
                System.out.println(this.numerator+"/"+this.denominator);
            }
        }
        else if(this.denominator>this.numerator){
            for(int x=2;x<this.denominator;x++){
                if(this.numerator%x==0&&this.denominator%x==0){
                    low=x;
                }
            }
            this.numerator=this.numerator/low;
            this.denominator=this.denominator/low;
            System.out.println(this.numerator+"/"+this.denominator);
        }
    }
}
