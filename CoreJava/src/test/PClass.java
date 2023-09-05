package test;

public class PClass {
	public static int b=10;
	public static void m2() {
		System.out.println("=====static method m2()======");
		System.out.println("Value of b: "+b);
	}
	 static {
		System.out.println("Parent Static block");
	}

}
