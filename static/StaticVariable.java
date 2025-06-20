/* print static variables in instance methods */
public class StaticVariable
{
    static int a=500;
    void number(){
        System.out.println(StaticVariable.a);
    }
    public static void main(String[] args) {
        StaticVariable s=new StaticVariable();
        s.number();
    }
}
/*
500
*/