package test;

import java.util.*;
public class Read {
	public Product p;//reference variable
	public Read(Product prod) {
		p=prod;//initializing reference variable
	}
	public void readProduct(Scanner sc) {
		System.out.println("Enter product code: ");
		p.pCode=sc.nextLine();
		System.out.println("Enter product name: ");
		p.pName=sc.nextLine();
		System.out.println("Enter product price: ");
		p.pPrice=sc.nextFloat();
		System.out.println("Enter product quantity: ");
		p.pQnty=sc.nextInt();
	}

}
