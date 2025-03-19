import java.util.Scanner;
/* +,-,*,/ using switch case */
/*public class drashti{
  public static void main(String[] args) {
    // /*calculator using switch case 
     Scanner sc=new Scanner(System.in);
     double result=0;
     System.out.println("enter the value of no 1 and no2");
     double no1=sc.nextDouble();
     double no2=sc.nextDouble();
     System.out.println("enter the operation no wise +.addition,-.subtraction,*.multiplication,/.division");
     char obj=sc.next().charAt(0);
   
     switch (obj) {
      case '+':
        result=no1+no2;
        break;
      case '-':
        result=no1-no2;
        break;
      case '*':
        result=no1*no2;
        break;
      case '/':
      if(no2==0){
        System.out.println("in devider 0 is not allowed !ERROR");
      }
      else{
        result=no1/no2;
      }break;
      default:
      System.out.println("enter correct operation");
        break;
     }
     System.out.println(+no1+" "+obj+" "+no2+" is "+result);
// System.out.printf("%.1f %c %.1f =%.1f",no1,obj,no2,result);
  }

}*/
/*sum of digits */
/*public class drashti {

  public static void main(String[] args) {
    System.out.println("enter the no for sum of digits");
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int last;
    int sum=0;
    while (no!=0) {
    last=no%10;
    sum+=last;
    no=no/10;
    }
    System.out.println(+sum);

  }
}*/
/*reverse no */
/*public class drashti {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no to reverse string");
    int no=sc.nextInt();
    int last;
    int reverse=0;
    while (no!=0) {
    last=no%10;
    reverse=reverse*10+last;
    no=no/10;
    }
    System.out.println(+reverse);

  }
}*/
/*break and continue statment */
/*public class drashti{
  public static void main(String[] args){    
    System.out.println("1.for loop with break statment");
    System.out.println("2.for loop with continue statment");
    System.out.println("3.while loop with break statment");
    System.out.println("4.while loop with continue statment");
    System.out.println("enter your choice");
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    if(no==1){
      int i;
      for(i=1;i<5;i++){
        if(i==2){
            System.out.println(+i);
            break;
        }
        System.out.println(+i);
      }
    }
    else if(no==2){
      int i;
      for(i=1;i<5;i++){
        if(i==2){
            // System.out.println(+i);
            continue;
        }
        System.out.println(+i);
      }
    }
    else if(no==3){
      int i=1;
            while(i<=5){
              if(i==2){
                  System.out.println(+i);
                  break;
              }
              System.out.println(+i);
              i++;
            }      
    }
    else if(no==4){
      int i=1;
      while(i <= 10) {
      if (i % 2 == 0) {
        i++;
      continue; // Skip the rest of the loop body for
      
      //even numbers
      }
      System.out.println("Odd number: " + i);
      i++;
      }
    }
    else{
      System.out.println("enter valid no");
    }

  }}*/
  // 1.Student details Instance variable Name , Rollnumber static Variable Div=B.Instance  Method DisplayName, Rollnumber. Static method dipslay Division.
  /*public class drashti {
    String name;
    int Rollnumber;
    static char div='B';

       public  void DisplayName(String name,int Rollnumber){
        System.out.println("name is " +name+ "  rollno is "+Rollnumber+ "  division is "+div);
       }  
      //         static void Displaydiv(){
      //      System.out.println("division is "+div);
      //  }
       public static void main(String[] args) {
        drashti s1=new drashti();
        drashti s2=new drashti();
        drashti s3=new drashti();
        drashti s4=new drashti();
        drashti s5=new drashti();

        s1.DisplayName("niya",111);
        s2.DisplayName("siya",222);
        s2.DisplayName("riya",333);
        s2.DisplayName("diya",444);
        s2.DisplayName("jiya",555);

        // drashti.Displaydiv();
      
       }
   
  
    }*/
  
  // 2. Employee Details Instance Variable EMP_ID,Emp_Name, Emp_designation, Emp_Salary.Static Varaible Company_Name. Intsance Method Disply Employee Details , staticMethod DisplyCompany Name
  /*public class drashti {
    int EMP_ID;
    String Emp_Name;
    String Emp_designation;
    int Emp_Salary;
    static String Company_Name="TATA";


       public void DisplayName(int EMP_ID,String Emp_Name,String Emp_designation,int Emp_Salary){
        System.out.println("|| EMPLOYEE ID  " +EMP_ID+ " || EMPLOYEE NAME  "+Emp_Name+ " || EMPLOYEE DESIGNATION  "+Emp_designation+ " || EMPLOYEE SALARY  "+Emp_Salary+ " || COMPANY NAME  " +Company_Name); 
       }  
      //         static void Displaydiv(){
      //      System.out.println("division is "+div);
      //  }
       public static void main(String[] args) {
        drashti E1=new drashti();
        drashti E2=new drashti();
        drashti E3=new drashti();
        drashti E4=new drashti();
        drashti E5=new drashti();
        E1.DisplayName(1001,"Ashok kumar","Manager",45000);
        E2.DisplayName(1002,"Nayan kumar","DEP_HD",55000);
        E3.DisplayName(1003,"Mitixa patel"," H R ",75000);
        drashti.Company_Name="BIRLA";
        E4.DisplayName(1004,"Nitin kumar","Sales_man",35000);
        E5.DisplayName(1005,"priti kumari","Sales-Rep", 30000);


       
        // drashti.Displaydiv();
      
       }
   
  
    }     */
  
  // 3. Default Constructor : Account holder name , Balance Instance Variable, Class name BankAccount , constructor name BankAccount , Instance Method Display Details of Account Holder name ,  Balance .
/*public class drashti{
  int AC_NO;
  String AC_NAME;
  int BAL;
  static String BANK_NAME="KANARA BANK GOV-LIM";
   static String IFSC_CODE="GAN54541AD";

   // MAKE PERAMETER WISE CONSTRUCTOR

  //  drashti(int i,String n,int s){
  //    AC_NO=i;
  //    AC_NAME=n;
  //    BAL=s;
  //  }
// WITHOUT PERAMETER CONSTRUCTOR
  drashti(){
    AC_NO=1587562256;
    AC_NAME="MANMOHANSINGH";
    BAL=55524751;
  }


     public void DisplayName(){
      System.out.println(" || ACCOUNT NO  : "+AC_NO+" || ACCOUNT HOLDER NAME  : "+AC_NAME+ " || BALANCE  : "+BAL+ " || BANK NAME  : "+BANK_NAME+ " || IFSC CODE  : "+IFSC_CODE);
     }  
    //         static void Displaydiv(){
    //      System.out.println("division is "+div);
    //  }
     public static void main(String[] args) {
      // drashti A1 = new drashti(54545544,"karan arayan",5545521);
      // A1.DisplayName();
      // drashti A2=new drashti(54545545,"neha swamii",55555);
      // A2.DisplayName();
      // drashti A3=new drashti(54545548,"siya ramani",5452145);
      // A3.DisplayName();
      // drashti A4=new drashti(54545544,"meshva dave",1237452);
      // A4.DisplayName();
      // drashti A5=new drashti(54545524,"ruchee mangal",4521731);
      // A5.DisplayName();
   
// WITHOUT PERAMETER CONSTRUCTOR
drashti A6 = new drashti();
A6.DisplayName();
      // drashti.Displaydiv();
    
     }
 

  }     
*/




