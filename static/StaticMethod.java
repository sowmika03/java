/* call static method in instance method */
public class StaticMethod
{
    static void smethod(){
        System.out.println("stat method");
    }
    void imethod(){
        StaticMethod.smethod();
        smethod();
    }
    public static void main(String[] args) {
        StaticMethod s=new StaticMethod();
        s.imethod();
    }
}
/*
stat method
stat method
*/