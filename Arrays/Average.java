class Average{
  public static void main(String[] args){
    int []a={1,2,3,4,5};
    int sum=0;
    for(int b:a){
      sum=sum+b;
    }
    int avg=sum/a.length;
    System.out.println(avg);
  }
}
/*
output: 3
*/