package DataTypes;

public class MainFile {
	static byte a=50;
	public static void main(String[] args) {
		System.out.println(a);//50
		a=(byte) 128;
		System.out.println(a);//-128
		//Unexcepted behaviour
	}	
	
}
