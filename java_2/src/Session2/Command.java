package Session2;


import java.util.ArrayList;
import java.util.List;

interface Order
{
  public void execute();
}
class buystock implements Order
{
  private Stock stock;
  public buystock(Stock stock)
  {
    this.stock=stock;
  }
  public void execute()
  {
    stock.buy();    // class member
  }
}
class sellstock implements Order
{
  private Stock stock;
  public sellstock(Stock stock)  // after creating cocnstructor it instanciate so it has some memory to acces that variable 
  {
    this.stock=stock;
  }
  public void execute()
  {
    stock.sell();    // class member
  }
}
//broker is main classs it must listen order
class Broker
{
  List<Order>list=new ArrayList<Order>();//list contains order type of elements
  public void takeorder(Order order) //list that command so that command into list 
  {
    list.add(order);
  }
  public void placeorder(Order order)// after adding we have to execute the commands
  {
         for(Order o : list)
         {
          o.execute();  
         }
         list.clear();
  }
}
class Stock 
{
  private String name="zomoto";
  private int quantity=1000;
  public void buy()
  {
    System.out.println("stock name:"+name+" quantity:"+quantity);
  }
  public void sell()
  {
    System.out.println("sell the stocks of zomoto");
  }
}
public class Command {

  public static void main(String[] args) {
  Stock stock= new Stock();
  buystock bs=new buystock(stock);
  sellstock ss=new sellstock(stock);
  
  Broker broker=new Broker();
  broker.takeorder(bs);
    broker.takeorder(ss);
    broker.placeorder(bs);
    broker.placeorder(ss);
  }

}
