package constructor;

public class AnotherClass extends ConstructorChain {
	int a;
	public AnotherClass() {
		super(55);
		System.out.println("hii");
	}
	public static void main(String[] args) {
		new AnotherClass();
	}
}
