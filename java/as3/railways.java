// package as3;


/*multiplae inharitance and interafce */

interface tradetails{
    void showtraininfo();    
}
interface pessangerdetail{
    void passengetinfo();    
}
interface seatdetails{
    void seatinfo();    
}

class ticketbokking implements tradetails,pessangerdetail,seatdetails{
    protected String trainname="VANDE BHARAT";
    private int trainno=1203461;
    protected String passangername;
    protected int age;
    public int seatno;
    public String seatype;
    private double ticketprice;
    ticketbokking(String passangername,int age,int seatno,String seattype){
        this.passangername=passangername;
        this.age=age;
        this.seatno=seatno;
        this.seatype=seattype;
        if(seattype.equals("AC"))
        ticketprice=1000;
        else
        ticketprice=500;
        //this.ticketprice=ticketprice;
    }
    public void showtraininfo(){
        System.out.println(trainname+" "+trainno);
    }
    public void passengetinfo(){
        System.out.println(passangername+" "+age);
    }
    public void seatinfo(){
        System.out.println(seatno+" "+seatype+" "+ticketprice);
    }
}
public class railways{
    public static void main(String[] args) {
        System.out.println("2199 : niya dodiya");
        ticketbokking t1=new ticketbokking("niya",20,1265,"NON-AC");
        t1.showtraininfo();
        t1.passengetinfo();
        t1.seatinfo();
    }
}
