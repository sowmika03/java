//create a class ,object,method,and its signature
class Basics
{
   void messages()
   {
       System.out.println("hello");
   }
   public static void main(String[] args)
   {
       Basics a=new Basics();
       System.out.println("hi");
       a. messages();
   }
}

class Name
{
    public static void main(String[] args)
    {
        System.out.println("Sowmika");
    }
}


public class Comments
{
    public static void main(String[] args)
    {
        /* this is a multi-line comment
        in java*/
        System.out.println("Multiline comment");
        //this is single line
        System.out.println("This is single comment");
    }
    }



class variables
    {
        public static void main(String[] args)
        {
            int a=100;
            float b=22.0f;
            boolean d=true;
            double c= 20.20;
            System.out.println(a);
             System.out.println(b);
              System.out.println(d);
               System.out.println(c);
            
            
            
        }
    }
    


class Localglobal
{
    int global = 5; 

    void display() 
    {
        int local = 10;
        System.out.println("Global: " + global);
        System.out.println("Local: " + local);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}

class Name
{
        static void name()
        {
            System.out.println("Sowmika");
        }
        public static void main(String[] args)
        {
            name();
        }
}
