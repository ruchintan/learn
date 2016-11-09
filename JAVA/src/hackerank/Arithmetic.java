package hackerank;

class Arithmetic
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Adder.call_add();
	}
}
class Adder extends Arithmetic
{
	public static void call_add()
	{
		System.out.println("My superclass is: Arithmetic");
		System.out.print(Arithmetic.add(32,10) + " "+ Arithmetic.add(12,1) + " " + Arithmetic.add(10,10));
	}
}
