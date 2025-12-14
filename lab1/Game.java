package lab1;
import java.util.Random;
public class Game {
    Random rand=new Random();
    String name;
    static boolean win=false;
    static String winner;
    
    Game(String name){
        this.name=name;
    }
    int total=0;
    public void move(){
        if(win==false){
            int dice=rand.nextInt(6);
            dice=dice+1;
            System.out.println(this.name+" rolled "+dice);
            total=total+dice;
            System.out.println("Sum of "+this.name+" dice numbers: "+total);
            System.out.println("------------------------------------------");
            if(total>=100){
                win=true;
                winner=this.name;
                System.out.println(winner+" wins");
            }
        }
        else{
            System.out.println(winner+" has already won");
        }
    }
}
