package java_8;

import java.util.function.Predicate;

public class CheckThenumberGraterOrNot {
public static void main(String[] args) {
	Predicate<Integer> greaterThan100Predicate = num -> num > 100;
    System.out.println(greaterThan100Predicate.test(101));
}
}
