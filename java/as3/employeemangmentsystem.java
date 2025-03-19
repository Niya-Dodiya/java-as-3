//package as3;

/*multilevel inharitance */

class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class student{
    protected int sid;
    public String sname;
    student(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
}
// address and employye have in a has a relationship
class Employee extends student{
    protected String name;
    private int id;
    private double salary;
    public Address address;


    Employee(int sid,String sname,String name, int id, double salary,Address address) {//constructor overloading
        super(sid, sname);
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address=address;
    }

    // Employee(Employee e) {//constructor overloading
    //     super(sid, sname);
    //     this.name = e.name;
    //     this.id = e.id;
    //     this.salary = e.salary;
    //     this.address = e.address;
    // }
    double calculateTax(){
        if(salary<=20000)
            return salary*0.01;
        else if(salary <= 50000)
            return salary*0.02;
        else
            return salary*0.03;
        
    }
    void display() {
        System.out.println("2199 : niya dodiya");
        System.out.println(" Employee ID: " + id + ",Employee  Name: " + name + ", Salary: " + salary+" address is: "+address.city+" "+address.state+" "+address.country+"  Student id:   "+sid);
        System.out.println("Tax is: "+calculateTax());
    }

}
public class employeemangmentsystem {
    
    public static void main(String[] args) {
        Address add=new Address("abc", "xyz", "pqr");
        Employee e1 = new Employee(120,"xyz","Alice", 101, 200000,add);
        // Employee e2 = new Employee(e1);//copy constructor
        e1.display();
        // e2.display();
    }
}


