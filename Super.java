class base{
    void example(){
        System.out.println("Base Class");
    }
}
class derive extends base{
    void example(){
        System.out.println("Derived Class");
    }

    void print(){
        example();
        super.example();
    }
}
        
public class Super{
    public static void main(String args[]){
        derive d = new derive();
        d.print();
    }
}
