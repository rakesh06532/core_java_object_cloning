package test;

public class CClass extends PClass {
	public static int a=10;
	public static void m1() {
		
		System.out.println("=====static method m1()======");
		System.out.println("Value of a: "+a);
	}
	 static {
		System.out.println("Child Static block");
	}
	public CClass()
	{
		 super();
	 }

}
