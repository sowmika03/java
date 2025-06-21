class Matches{
  public static void main(String[] args){
    String s1="Hello12345";
    boolean r=s1.matches("[a-zA-z]+\\d+");
    System.out.println(r);
  }
}
/*
true
*/