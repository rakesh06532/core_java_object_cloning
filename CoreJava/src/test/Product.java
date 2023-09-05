package test;

public class Product {
	public String pCode,pName;
	public float pPrice;
	public int pQnty;
	public void getProduct() {
		System.out.println("=====ProductDetails=======");
		System.out.println("Product code: "+pCode);
		System.out.println("Product Name: "+pName);
		System.out.println("Product price: "+pPrice);
		System.out.println("Product Quantity: "+pQnty);
		
	}

}
