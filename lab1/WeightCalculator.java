package lab1;
public class WeightCalculator {
    int age;
    double height;
    
    public void input(int age,double height){
        this.age=age;
        this.height=height;
        System.out.println("Your age: "+this.age);
        System.out.println("Your height: "+this.height+"cm");
    }
    public void recommendWeight(){
        double weight=(this.height-100+(this.age/10))*0.9;
        System.out.println("Your weight: "+weight+"kg");
    }
}
