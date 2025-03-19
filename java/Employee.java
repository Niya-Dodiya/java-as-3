class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
// address and employye have in a has a relationship
class Employee {
    String name;
    int id;
    double salary;
    Address address;


    Employee(String name, int id, double salary,Address address) {//constructor overloading
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address=address;
    }

    Employee(Employee e) {//constructor overloading
        this.name = e.name;
        this.id = e.id;
        this.salary = e.salary;
        this.address = e.address;
    }
    double calculateTax(){
        if(salary<=20000)
            return salary*0.01;
        else if(salary <= 50000)
            return salary*0.02;
        else
            return salary*0.03;
        
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary+" "+address.city+" "+address.state+" "+address.country);
        System.out.println(calculateTax());
    }

    public static void main(String[] args) {
        Address add=new Address("abc", "xyz", "pqr");
        Employee e1 = new Employee("Alice", 101, 200000,add);
        Employee e2 = new Employee(e1);//copy constructor
        e1.display();
        e2.display();
    }
}

