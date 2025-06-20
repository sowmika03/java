/* call instance method in static method */
public class InstanceMethod
{
    void print(){
        System.out.println("Instance Print method");
    }
    static void printme(){
        System .out.println("Static method");
        InstanceMethod s=new InstanceMethod();
        s.print();
    }
    public static void main(String[] args) {
        printme();
    }
}
/*
Static method
Instance Print method
*/