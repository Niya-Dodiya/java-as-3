// 2199 niya doiya
// package as3;
/*multilevel inharitance and method overloadding */
class cafe{
     protected String cafename,location;
    cafe(String cafename,String location){
        this.cafename=cafename;
        this.location=location;
    }

    void showdetails(){
        System.out.println(cafename);
        System.out.println(location);
    }
 }
class menu extends cafe{
     protected String itemname;
     protected double price;
     menu(String cafename,String location,String itemname,double price){
        super(cafename, location);
        this.itemname=itemname;
        this.price=price;
     }

     void showdetails(){
        super.showdetails();
        System.out.println(itemname);
        System.out.println(price);
    }
}

class order1 extends menu{
    private  String customername;
    private int quantity;
    protected double totalammount;
    order1(String cafename,String location,String itemname,double price,String customername,int quantity){
        super(cafename, location, itemname, price);
        this.customername=customername;
        this.quantity=quantity;
        this.totalammount=price*quantity;
    }

    void showdetails(){
        super.showdetails();
        System.out.println(customername);
        System.out.println(quantity);
        System.out.println(totalammount);
    }
}
public class cafesystem{
    public static void main(String[] args) {
        System.out.println("2199 : niya dodiya");
        order1 o1=new order1("LEELA'S CAFE ", "AHEMDABD", "COFE", 150, "RITA SHAH",2);
        o1.showdetails();
    }
}
