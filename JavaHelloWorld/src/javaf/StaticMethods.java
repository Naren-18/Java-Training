package javaf;

public class StaticMethods {
	public   StaticMethods() {
		System.out.println("From  Constructor");
		
	}
	{
		System.out.println("From  non Static Block");
		
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		StaticMethods obj=new StaticMethods();
	}
	
}
