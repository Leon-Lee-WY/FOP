package week10;
public class Connection {
    String x;
    static int num=0;
    boolean hasdisconnected = false;
    Connection(String x){
        this.x=x;
        num+=1;
    }
    public void disconnect(){
        if(hasdisconnected==false){
            hasdisconnected=true;
            System.out.println(this.x+" disconnected");
            num=num-1;
        }
        else{
            System.out.println(this.x+" is already disconnected");
        }
    }
    public static void display(){
        System.out.println(num+" connected");
    }
}
