package test2;
import java.util.*;

public class Read {

	public void readStudent(Scanner sc,Student stu)
	{
		System.out.println("Enter student name: ");
		stu.stuName=sc.nextLine();
		System.out.println("Enter Student Branch: ");
		stu.branch=sc.nextLine();
		System.out.println("Enter Student Roll no: ");
		stu.rollNo=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student hNo: ");
		stu.ad.hNo=sc.nextLine();
		System.out.println("Enter Student sName: " );
		stu.ad.sName=sc.nextLine();
		System.out.println("Enter Student City: ");
		stu.ad.city=sc.nextLine();
		System.out.println("Enter Student Pincode: ");
		stu.ad.pcode=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Mail Id: ");
		stu.c.mailId=sc.nextLine();
		System.out.println("Enter Student PhNo: ");
		stu.c.phNo=sc.nextLong();
		
	}

}
