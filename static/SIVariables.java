/* print static,instance variables in main method*/
public class SIVariables
{
    int q=100;
    byte r=120;
    static int s=500;
    static byte t=125;
    public static void main(String[] args) {
        SIVariables a=new SIVariables();
        System.out.println(a.q);
        System.out.println(a.r);
        System.out.println(s);
        System.out.println(SIVariables.t);
    }
}
/*
100
120
500
125
*/