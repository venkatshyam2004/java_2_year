package session1;

public class Ex2 {
    private static Ex2 obj1;
    private static int x;
    private static int y;
private Ex2(){
    this.x=10;
    this.y=20;
}
public static Ex2 getObject(){
     if (obj1!=null){
        obj1=new Ex2();
     }
     return obj1;
}
public void setXY(int x,int y){
    this.x=10;
    this.y=20;
}
    
}