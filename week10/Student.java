package week10;
public class Student{ //1.a
    
    String contact_number; //1.b
    /*Student(){   1.c 
        contact_number=null;
    }*/
    
    Student(String c){  //1.d
        contact_number=c;
    }
    
    /*public int getContact(){  1.e
        return contact_number;}*/
    public void setContact(String c){ //1.h
        contact_number=c;}
    
    public void displayContact(){ //1.f
        System.out.println(contact_number);
    }
}
