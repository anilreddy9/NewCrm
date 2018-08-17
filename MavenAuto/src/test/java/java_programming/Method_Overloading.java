package java_programming;

public class Method_Overloading {
//Same method name but different parameters/variables
	int add1(int a, int b)
	{
		return a+b;
		
	}
	int add1(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		Method_Overloading m1 = new Method_Overloading();
		System.out.println(m1.add1(11, 12));
		System.out.println(m1.add1(12, 36, 28));
		
	}
}
