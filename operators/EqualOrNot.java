import java.util.Scanner;
import java.io.*;
class EqualOrNot{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a==b){
	    System.out.println("Equal");
	}
        else{
	    System.out.println("Not Equal");
	}
    }
}