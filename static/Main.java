/*write a class with 2 static variables,2 instance variables,2 static methods,2 instance methods and a main method */
public class Main
{
    int a=100;
    byte d=65;
    static int b=50;
    static byte c=35;
    void instanceMethod1(){
        System.out.println("Instance method1");
    }
    void instanceMethod2(){
        System.out.println("Instance method2");
    }
    static void hello(){
        System.out.println("Hello Static method");
    }
    static void java(){
        System.out.println("Java Static method");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        hello();
        Main s=new Main();
        s.instanceMethod1();
        s.instanceMethod2();
        Main.java();
        System .out.println (s.a);
        System .out.println (s.d);
        System .out.println (b);
        System .out.println (Main.c);
    }
}
/*
Main Method
Hello Static method
Instance method1
Instance method2
Java Static method
100
65
50
35
*/