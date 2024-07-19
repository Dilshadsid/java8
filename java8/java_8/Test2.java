package java_8;

interface Demo {
	void demo();

}

class Testt {
	void num() {
		System.out.println("xyz");
	}
}

public class Test2 extends Testt {
	public static void main(String[] args) {
		Demo d = () -> System.out.println("....done the code");
		d.demo();

		Testt t = new Testt();
		t.num();
	}
}
