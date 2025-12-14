package week10;
public class Coordinate {
    int x,y;
    Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getCoordinateX(){
        return this.x;
    }
    public int getCoordinateY(){
        return this.y;
    }
    
    public void setCoordinateX(int x){
        this.x=x;
    }
    
    public void setCoordinateY(int y){
        this.y=y;
    }
    
    public void displayCoordinate(){
        System.out.println("New Coordinate: "+this.x+","+this.y);
    }
}
