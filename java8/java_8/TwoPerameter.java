package java_8;

  interface TwoPRM{
	  int sum(int num1,int num2);
  }
public class TwoPerameter {
 public static void main(String[] args) {
	 TwoPRM tp=(num1,num2)->  num1 + num2;
	 System.out.println(tp.sum(10, 20));
}
}
