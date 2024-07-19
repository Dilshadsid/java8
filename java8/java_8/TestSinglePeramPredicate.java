package java_8;
  
 interface SnglePerameter{
	 void sun(int number);
 }
public class TestSinglePeramPredicate {
    public static void main(String[] args) {
    	SnglePerameter sp=(number)-> System.out.println("this is :"+ number);
    		sp.sun(7684);
    	
	}
}
