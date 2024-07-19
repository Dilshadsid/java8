package java_8;

import java.util.function.Predicate;

public class findNullOrNotNll {
public static void main(String[] args) {
	Predicate<Object> nonNullPredicate = obj -> obj != null;
    System.out.println(nonNullPredicate.test(null));
}
}
