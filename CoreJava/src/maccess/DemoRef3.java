package maccess;
import test.*;
import java.util.*;
public class DemoRef3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Address ad=new Address();
		Contact c=new Contact();
		Student st=new Student();
		Read2 r1=new Read2(ad);
		Read2 r2=new Read2(c);
		Read2 r3=new Read2(st);
		r1.readAddress(sc);
		r2.readContact(sc);
		r3.readStudent(sc);
		Display2 d1=new Display2(ad);
		Display2 d2=new Display2(c);
		Display2 d3=new Display2(st);
		d1.displayAddress();
		d2.displayContact();
		d3.displayStudent();
		sc.close();
		
	}

}
