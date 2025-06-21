/* equalsIgnoreCase(), startWith(), endsWith(), compareTo() */
class Cases{
  public static void main(String[] args){
    String s1="welcome to sviet";
    String s2="hello java";
    String s3="Hello Java";
    System.out.println(s2.equalsIgnoreCase(s3));
    System.out.println(s1.startsWith("wel"));
    System.out.println(s1.startsWith("el"));
    System.out.println(s1.endsWith("sviet"));
    System.out.println(s2.endsWith("lo"));
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s3));
  }
}
/*
true
true
false
true
false
15
32
*/