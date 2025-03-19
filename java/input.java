import java.util.Scanner;

// the program make the paattern

public class input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of pattern whoud you like to");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" "+j+" ");
        //     }
        //         System.out.println("  ");
        // }
        // for(int i=n;i>0;i--){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" "+j+" ");
        //     }
        //         System.out.println("  ");
        // }
        int rows = 5;
        //triangle
        
    // first loop to print all rows
    for (int i = 0; i < rows; i++) {

        // inner loop 1 to print white spaces
        for (int j = 0; j < 2 * (rows - i) - 1; j++) {
            System.out.print(" ");
        }

        // inner loop 2 to print star * character
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print(" "+i);
        }
        System.out.println(" ");
    }
    }
}
// class person{
//      String name;
//      int age;
// // function to get value from the user and esay to understand
//     public String getname(){
//         return name;
//     }
//     public void setname(String name){
//         this.name=name;
//     }
//     // public String getname2(){
//     //     return name2;
//     // }
//     // public void setname2(String name2){
//     //     this.name2=name2;
//     // }
//     // function to get age
//     public int getage(){
//         return age;
//     }
//     public void setage(int age){
//         this.age=age;
//     }
//     // function to print valuse
//      public void dis(){
//         System.out.println(" name=  "+name+"   age= "+age);
//         // System.out.println(" name=  "+name);
//         // System.out.println("   age= "+age);
//            }
//     public void birth(int age){
//         System.out.println("before age is"+age);
//         age=age+1;
//         System.out.println("afther age is"+age);
//     }

// }
// public class input{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         person p1=new person();
//         System.out.println("enter your name");
//         String name=sc.nextLine();
//         p1.setname(name);
//         System.out.println("enter your age");
//         int age=sc.nextInt();
//         p1.setage(age);
//         System.out.println("display information");
//         p1.dis();
//         person p2=new person();
//         //System.out.println("enter your name p2");
//         // String name2=sc.nextLine();
//         // p2.setname(name);
//         p2.name="siya";
//         System.out.println("enter your age p2");
//         int age2=sc.nextInt();
//         p2.setage(age2);
//         System.out.println("display information");
//         p2.dis();
//         p2.birth(age2);
//         // Scanner.close();

//     }
// }

/*public class input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of pattern whoud you like to");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
                System.out.println("  ");
        }
    }
}*/