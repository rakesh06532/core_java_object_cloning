package test;

import java.util.*;
public class Read2 {
	public Student st;
	public Address ad;
	public Contact c;
	public Read2(Address adr) {
		ad=adr;
	}
	public Read2(Student stud) {
		st=stud;
	}
	public Read2(Contact co) {
		c=co;
	}
	public void readAddress(Scanner sc) {
		System.out.println("Enter house no: ");
		ad.hNo=sc.nextLine();
		System.out.println("Enter state name: ");
		ad.sName=sc.nextLine();
		System.out.println("Enter city: ");
		ad.city=sc.nextLine();
		System.out.println("Enter pcode: ");
		ad.pcode=Integer.parseInt(sc.nextLine());
	}
	public void readContact(Scanner sc) {
		System.out.println("Enter mailId: ");
		c.mailId=sc.nextLine();
		System.out.println("Enter phone no: ");
		c.phNo=Long.parseLong(sc.nextLine());
	}
	public void readStudent(Scanner sc) {
		System.out.println("Enter student name: ");
		st.stuName=sc.nextLine();
		System.out.println("Enter student branch: ");
		st.branch=sc.nextLine();
		System.out.println("Enter student roll no: ");
		st.rollNo=sc.nextInt();
	}

}
