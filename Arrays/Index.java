import java.util.Scanner;
public class Index{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in); 
      System.out.println("enter no.of values:");
      int n=sc.nextInt();         
      int[] numbers = new int[n];
      int count=0;
      for(int i=0;i<n;i++){
          System.out.println("enter value:");
          numbers[i]=sc.nextInt();
      }
      int targetEle =sc.nextInt();
      for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] == targetEle) {
            count++;
          }
      }
      if(count==1)
      {
         System.out.println("element found");
       }
    else{
              System.out.println("element not found");
        }
}
}
/*
enter no.of values:
3
enter value:
12
enter value:
23
enter value:
34
356
element not found

enter no.of values:
3
enter value:
34
enter value:
23
enter value:
31
23
element found
*/