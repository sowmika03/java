import java.util.Scanner;
class LoopEOrN{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b){
      System.out.println("Equal");
    }
    else if(a!=b){
      System.out.println("Not Equal");
    }
  }
}
/*
3
5
Not Equal

9
9
Equal
*/
