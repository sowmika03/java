/* print instance variables in static methods */
public class InstanceVariables
{
    int a=300;
    static void print(){
        InstanceVariables s=new InstanceVariables();
        System.out.println (s.a);
    }
    public static void main(String[] args) {
        print();
    }
}
/*
300
*/