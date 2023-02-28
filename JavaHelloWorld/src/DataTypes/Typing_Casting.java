package DataTypes;

public class Typing_Casting {
public static void main(String[] args) {
	byte b=100;
	int a=78;
	//Explicit=we Have to specify the type
	b=(byte) a;
	System.out.println(b);
	//Implicit=converts automatically
	a=b;
	System.out.println(a);
	}

}
