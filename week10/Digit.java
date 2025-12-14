package week10;
public class Digit { //2.a
    int number; //2.b
    
    Digit(int num){ //2.c
        number=num;
    }
    
    /*public int digitMultiplication(){ //2.d
        String numstr=Integer.toString(number);
        int multiply=1;
        for(int i=0;i<numstr.length();i++){
            char thatchar=numstr.charAt(i);
            int thatint=thatchar-'0';
            multiply=multiply*thatint;
        }
        return multiply;
    }*/
    public void digitMultiplication(){ //2.d
        String numstr=Integer.toString(number);
        int multiply=1;
        for(int i=0;i<numstr.length();i++){
            char thatchar=numstr.charAt(i);
            int thatint=thatchar-'0';
            multiply=multiply*thatint;
        }
        System.out.println(multiply);
    }
}
