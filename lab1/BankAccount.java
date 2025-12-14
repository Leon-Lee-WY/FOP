package lab1;
public class BankAccount {
    String name;
    String ic;
    String passport;
    int depo;
    
    BankAccount(String name,String ic,String passport,int depo){
        this.name=name;
        this.ic=ic;
        this.passport=passport;
        this.depo=depo;
    }
    public void deposit(int x){
        this.depo=this.depo+x;
    }
    public void withdraw(int y){
        if(y<=this.depo){
            this.depo=this.depo-y;
        }
        else{
            System.out.println("Balance insufficient.");
        }
    }
    public void displayBalance(){
        System.out.println("Your balance: "+this.depo);
    }
}
