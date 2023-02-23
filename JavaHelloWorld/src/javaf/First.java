package javaf;

public class First {
	public static void main(String[] args) {
		System.out.print("Hello World");
		method1();
		First obj=new First();
		obj.method2();
	}
	static {
		System.out.println("Staic Block");
	}
	static void method1() {
		System.out.println("Staic Method Block1");
	}
	void method2() {
		System.out.println("Normal Method Block1");
	}
}
