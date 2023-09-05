package test;

public class Display2 {
	public Address ad;
	public Contact c;
	public Student st;
	public Display2(Address addr) {
		this.ad=addr;
	}
	public Display2(Contact con) {
		this.c=con;
	}
	public Display2(Student stud) {
		this.st=stud;
	}
	public void displayAddress() {
		ad.getAddress();

	}
	public void displayContact() {
		c.getContact();
	}
	public void displayStudent() {
		st.getStudent();
	}
}
