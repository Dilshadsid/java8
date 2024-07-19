package java_8;

import java.util.function.Predicate;

public class CheckStringLengthGraterOrNot {
	public static void main(String[] args) {
		Predicate<String> lengthPredicate = str -> str.length() > 5;
		System.out.println(lengthPredicate.test("dilshad"));
	}

}
