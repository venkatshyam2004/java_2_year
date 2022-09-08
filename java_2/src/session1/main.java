package session1;

import javax.xml.crypto.Data;

class Database {
    private static Database dbObject;
    private Database(){

    }
    static Database getInstance(){
        if(dbObject==null){
            dbObject=new Database();
        }
        return dbObject;
    }
    public void getConnection(){
        System.out.println("Hello World");
    }
}
 class main {
    
    public static void main(String[] args) {
        Database db1;
        db1=Database.getInstance();
        db1.getConnection();
    }
    
}
