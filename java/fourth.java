public class fourth{
    static void sm(){
        System.out.println("static method can be called");
    }
    static void pm(){
        System.out.println("public method can be called");
    }
    public static void main(String[] args){
        sm();
        fourth myobj=new fourth();
        myobj.pm();
    }
}