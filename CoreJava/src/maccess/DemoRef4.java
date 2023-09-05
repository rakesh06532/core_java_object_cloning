package maccess;
import test2.*;
import java.util.*;

public class DemoRef4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Address ad=new Address();
		Contact c=new Contact();
		Student stu=new Student(ad,c);
		Read rd=new Read();
		rd.readStudent(sc, stu);
		Display d=new Display();
		d.displayStudent(stu);
	}

}
