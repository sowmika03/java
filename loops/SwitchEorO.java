import java.util.Scanner;
class SwitchEorO{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int rem=a%2;
    switch(rem)
    {
      case 0:
      {
        System.out.println(a+" is even number");
        break;
      } 
      default:
      {
        System.out.println(a+ " is odd number");
        break;
      }
    }
}
} 
/*
45
45 is odd number

44
44 is even number
*/