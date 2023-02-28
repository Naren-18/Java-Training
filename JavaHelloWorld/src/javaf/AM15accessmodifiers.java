package javaf;


class A
{
public void display()
    {
        System.out.println("GeeksforGeeks");
    }
}
 
public class AM15accessmodifiers
{
public static void main(String args[])
    {
        A obj = new A();
        // Trying to access private method
        // of another class
        obj.display();
    }
}