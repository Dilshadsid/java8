package java_8;

import java.util.function.Predicate;

public class CheckTheStringStartspecificletter {
public static void main(String[] args) {
	Predicate<String> startsWithPredicate = str -> str.startsWith("a");
    System.out.println(startsWithPredicate.test("ailshad"));
}
}
