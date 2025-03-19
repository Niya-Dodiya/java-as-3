import java.util.Scanner;
//area of reatangale triangle and circle
/*public class overload{
    static double calArea(double radi){
      return Math.PI*radi*radi;
    }
    static int calArea(int height,int weight){
      return height*weight;
    }
    static double calArea(double base,double height){
      return 0.5*base*height;
    }
    public static void main(String[] args){
        System.out.println("enter 1.calculate area of circle");
        System.out.println("enter 2.calculate area of retangle");
        System.out.println("enter 3.calculate area of triangle");
        System.out.println("enter your choice");
        double areaofcir=overload.calArea(15);
        // System.out.println("area of circle is"+areaofcir);
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i==1){
        System.out.println("enter the radius of the circle");
        int rad=sc.nextInt();
        double rad1=overload.calArea(rad);
        System.out.println(+rad1);
        // overload.calArea(12);
        }
        else if(i==2){
        System.out.println("enter the height of retangle");
        int height=sc.nextInt();
        System.out.println("enter the weith of retangle");
        int weight=sc.nextInt();
        double retan=overload.calArea(height,weight);
        // overload.calArea(55.05,56.56);
        System.out.println(+retan);
        }
        else if(i==3){
        System.out.println("enter the base of triangle");
        double height=sc.nextDouble();
        System.out.println("enter the height of triangle");
        double weight=sc.nextDouble();
        double tria=overload.calArea(height,weight);
        System.out.println(+tria);
        // overload.calArea(3,5);

        }
        else{
            System.out.println("enter the valid choice");
        }
    }
}*/

class overload{  
  void draw(){System.out.println("drawing...");}  
  }  
   class Rectangle extends overload{  
  void draw(){System.out.println("drawing rectangle...");}  
  }  
   class Circle extends overload{  
  void draw(){System.out.println("drawing circle...");}  
  }  
   class Triangle extends overload{  
  void draw(){System.out.println("drawing triangle...");}  
  }  
   class TestPolymorphism2{  
  public static void main(String args[]){  
  overload s;  
  // s.draw();
  s=new Rectangle();  
  s.draw();  
  s=new Circle();  
  s.draw();  
  s=new Triangle();  
  s.draw();  
  // s=new overload();
  // s.draw();
  s.draw();
  }  
  }