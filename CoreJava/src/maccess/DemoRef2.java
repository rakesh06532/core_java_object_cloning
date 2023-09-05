package maccess;
import test.*;
import java.util.*;

public class DemoRef2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		Read r=new Read(p);//constructor call with reference as parameter
		r.readProduct(sc);//method call with reference as parameter
		Display d=new Display(p);//constructor call with reference as parameter
		d.displayProduct();//method call with out parameter
		sc.close();
	}

}
