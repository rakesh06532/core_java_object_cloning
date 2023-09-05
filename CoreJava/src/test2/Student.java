package test2;

public class Student {
	public String stuName,branch;
	public int rollNo;
	public Address ad;
	public Contact c;
	
	public Student(Address addr,Contact con) {
		ad=addr;
		c=con;
	}
	
	public void getStudent() {
		System.out.println("====StudentDetails======");
		System.out.println("Student Name: "+stuName);
		System.out.println("Student Branch: "+branch);
		System.out.println("Student rollNo: "+rollNo);
		ad.getAddress();
		c.getContact();
	}

}
