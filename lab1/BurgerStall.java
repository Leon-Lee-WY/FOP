package lab1;
public class BurgerStall {
    String id;
    int burgerSold;
    static int totalBurgers;
    
    BurgerStall(String id,int burgerSold){
        this.id=id;
        this.burgerSold=burgerSold;
        totalBurgers=totalBurgers+this.burgerSold;
    }
    
    public void sold(int addBurgers){
        burgerSold=burgerSold+addBurgers;
        totalBurgers=totalBurgers+addBurgers;
    }
    
    public void displaySold(){
        System.out.println("Burger stall "+this.id+" sold "+burgerSold+" burgers");
    }
    
    public static void displayTotal(){
        System.out.println(totalBurgers+" burgers sold");
    }
}
