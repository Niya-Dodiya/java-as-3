// package as3;
// 2199 niya dodiya
abstract class order {
    protected int orderid;
    public String productname;
    protected double quantity;
    protected double price;

    order(int orderid,String productname,double quantity,double price){
        this.orderid=orderid;
        this.productname=productname;
        this.quantity=quantity;
        this.price=price;
    }
    abstract void displayorderdetails();
}
abstract class  payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    abstract void processpyment();    
}

class paypalpayment extends order{
        paypalpayment(int orderid,String productname,double quantity,double price){
            super(orderid, productname, quantity, price);}

//            System.out.println("succesfully payment in paypal");
            void displayorderdetails() {
                //TODO Auto-generated method stub
                 System.out.println("ORDER ID "+orderid+" PRODUCT NAME "+productname+" QUANTITY "+quantity+" PRICE "+price);
                
            }  
}

class creditcard extends payment{
    //creditcard(int orderid,String productname,double quantity,double price){
        creditcard(double amount){
            super(amount);
        }
      //  System.out.println("succesfully payment in creditcard");
        void processpyment(){
            System.out.println("payment of ammount "+amount+" processed using creditcard");
        }
  }

public class PAYMENTAPP{
    public static void main(String[] args) {
        System.out.println("2199 : niya dodiya");
        order a1=new paypalpayment(101,"exyz",2000,125463.52);
        a1.displayorderdetails();
        payment p1=new creditcard(50000);   
        p1.processpyment();

    }
}