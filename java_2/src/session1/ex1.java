package session1;
class abc{
    static abc obj=new abc();
    private abc(){

    }
    public static abc getInstance(){
        int x=10;
        int y=20;
        System.out.println(x+y);
        return obj;
    }
}

public class ex1 {
    public static void main(String[] args) {
        
        abc obj1=abc.getInstance();
        abc obj2=abc.getInstance();
    }
    
}
