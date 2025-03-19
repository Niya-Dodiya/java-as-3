import java.util.Scanner;
//amstrong no
 /*public class amstrong{
  public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        int temp=no;
        float sum,r,n;
        sum=0;
        r=0;
        n=0;
        r=no%10;
        n=r*r*r;
        sum=sum+n;
        no=no/10;
        if(temp==no){
            System.out.println("IT IS AMSTRONG NO");
        }
        else{
            System.out.println("IT IS NOT A AMSTRONG NO");
 
        }
    }
}*/
// THE FACTORIAL NO
/*public class amstrong{  
        static void fact(int no){
        int i;
        int fact=1;
        for(i=1;i<=no;i++){
            fact=i*fact;
        }
        System.out.println("THE FACTORIAL IS "+fact);
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        amstrong.fact(no);
    }
}*/
//prime no
/*public class amstrong{    
 public static void main(String[] args){    
  int i,m=0,flag=0;
  Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();      
  //it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0) {
     System.out.println(n+" is prime number");
    }  
  }//end of else  
 }}*/
//fibbonacii series
 /*public class amstrong{
        int n1,n2,n3,i;
   static void fact(int count){
        int n1,n2,n3,i;
        n1=0;
        n2=1;
        System.out.print(" "+n1+" "+n2);
        for(i=2;i<count;i++){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        }}
 public static void main(String[] args){
         int count=10;  
         amstrong.fact(count);
}}*/

// palidrom no
/*public class amstrong{
  
        static void pal(int no){
        int orignal=no;
       int lastdigit,reverse=0;
        while(no>2){
            lastdigit=no%10;
            reverse=reverse*10+lastdigit;
            no=no/10;
        }
        System.out.println("reverse no is"+reverse);
        if(orignal==reverse){
            System.out.println("IT IS PALIDROM  NO");
        }
        else{
            System.out.println("IT IS NOT A PALIDROM NO");
 
        }
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        
         System.out.println("enter the no");
        int no=sc.nextInt();
        amstrong.pal(no);
    }
}*/


    