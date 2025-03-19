//package as3;
/* hyriarchical inharitance */
class collage{
    protected String clgname="ks";
    private  int clgcode=01;

    void displayclginfo(){
        System.out.println("collage name:" +clgname);
        System.out.println("collage code: "+clgcode);
    }
}
class student extends collage{
     private int marks[] ={88,54,98};
     int total;
     protected char grade;

     void calculatetotalmarks(){
        for(int mark:marks){
            total+=mark;
        }
     }

     void calculategrade(){
        grade=total/3 >= 85 ? 'A' : 'B';
     }
    
     void displayinfo(){
        displayclginfo();
        calculatetotalmarks();
        calculategrade();
        System.out.println("total marks:"+total);
        System.out.println("Grade: "+grade);
     }
}
public class studentmarks{
    public static void main(String[] args) {
        System.out.println("2199: niya dodiya");
        student s1=new student();
        s1.displayinfo();
    }
}
