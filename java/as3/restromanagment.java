// multiplae inharitance with overriden interface method
interface foodservice{
    void preaparefood();
    void servefood();
}
class Restorent implements foodservice{
    protected String foodname;
    private double price;

    Restorent(String foodname,double price){
        this.foodname=foodname;
        this.price=price;
    }
    
     public void preaparefood(){
            System.out.println("The food is preaparing :"+foodname);
     }
     public void servefood(){
            System.out.println("the price of food is :"+price);
     }
    
}
class cateringservice implements foodservice{
    private String eventname;
    private int guestcount;
    cateringservice(String eventname,int guestcount){
        this.eventname=eventname;
        this.guestcount=guestcount;
    }
    public void preaparefood(){
            System.out.println("the food is preaparing for "+eventname+ "  this event");
    }
    public void servefood(){
            System.out.println("total no of guest is :"+guestcount);
    }
}


class restromanagment{
    public static void main(String[] args) {
        System.out.println("2199 : niya dodiya");
        Restorent r1=new Restorent("burger",223.8);
        r1.preaparefood();
        r1.servefood();
        cateringservice c1=new cateringservice("birthdayparty",250);
        c1.preaparefood();
        c1.servefood();
    }
}