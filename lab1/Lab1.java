package lab1;
public class Lab1 {
    public static void main(String[] args) {
        /*Number a=new Number();  lab1
        a.displayNum();
        a.displayEven();
        a.displayPrime();
        a.findMinMax();
        a.displayAV();
        a.displaySquare();*/
        
        /*BankAccount acc=new BankAccount("Lee Wuey Yong","060512011323","89939894",3000);
        acc.deposit(2000);
        acc.withdraw(2030);
        acc.deposit(4000);
        acc.withdraw(5000);  lab2
        acc.displayBalance();*/
        
        /*WeightCalculator guy=new WeightCalculator();
        guy.input(19,170);  lab3
        guy.recommendWeight();*/ 
                
         /*Fraction frac=new Fraction();       
         frac.input(9,10);
         frac.setnumerator(35);   lab4
         frac.setdenominator(700);
         frac.displayLowestTerm();*/
         
         /*Game player1=new Game("Mr. Tandoori");
         Game player2=new Game("Mr. Chopsticks");
         while(Game.win==false){
             player1.move();          lab5
             if(Game.win==false){
                 player2.move();
             }
         }*/
         
        /* BurgerStall b1=new BurgerStall("BB099",25);
         BurgerStall b2=new BurgerStall("BB095",100);
         BurgerStall b3=new BurgerStall("BT987",99);
         b1.sold(72);
         b2.sold(9);
         b1.displaySold();
         b2.displaySold();  lab6
         b3.displaySold();
         BurgerStall.displayTotal();*/
        
        money s=new money(283492.19);
        money ss=new money(39348.32);
        double a=s.roundUp();
        double b=ss.roundUp();
        money.subtract(a,b);
    }    
}
