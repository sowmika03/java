/* call static,instance methods in main method */
public class SIMethods
{
    void instancemethod1(){
        System.out.println("instance method1");
    }
    void instancemethod2(){
        System.out.println("instance method2");
    }
    static void statmethod1(){
        System.out.println("static method1");
    }
    static void statmethod2(){
        System.out.println("static method2");
    }
    public static void main(String[] args) {
        SIMethods s=new SIMethods();
        s.instancemethod1();
        s.instancemethod2();
        SIMethods.statmethod1();
        statmethod2();
    }
}
/*
instance method1
instance method2
static method1
static method2
*/