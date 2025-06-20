class S2
{
    int a=10;
    byte d=6;
    static int b=5;
    static byte c=3;
    {
        System .out.println("ins1 c1");
    }{
        System .out.println("ins2 c1");
    }
    static{
        System.out.println("stat1 c1");
    }
    static{
        System.out.println("stat2 c1");
    }
    void instanceMethod1(){
        System.out.println("Instance method1 c1");
    }
    void instanceMethod2(){
        System.out.println("Instance method2 c1");
    }
    static void hello(){
        System.out.println("Hello Static method c1");
    }
    static void java(){
        System.out.println("Java Static method c1");
    }
    
}
public class S1
{
    int a=100;
    byte d=65;
    static int b=50;
    static byte c=35;
    {
        System .out.println("ins1");
    }{
        System .out.println("ins2");
    }
    static {
        System.out.println("stat1");
    }
    static {
        System.out.println("stat2");
    }
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
        S1 s=new S1();
        s.instanceMethod1();
        s.instanceMethod2();
        S1.java();
        System .out.println (s.a);
        System .out.println (s.d);
        System .out.println (b);
        System .out.println (S1.c);
        S2 e=new S2();
        System.out.println(e.a);
        System.out.println(e.d);
        System.out.println(S2.b);
        System.out.println(S2.c);
        e.instanceMethod1();
        e.instanceMethod2();
        S2.hello();
        S2.java();
    }
}