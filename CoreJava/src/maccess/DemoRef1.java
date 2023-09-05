package maccess;

import test.*;
import java.util.*;

public class DemoRef1 {
   public static void main(String[] args) {
	   Address ad=new Address();//Without parameter
	   Employee e=new Employee(ad);//With parameter
	   
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee Id: ");
	e.eId=sc.nextLine();
	System.out.println("Enter employee Name: ");
	e.eName=sc.nextLine();
	System.out.println("Enter employee Designation: ");
	e.eDesig=sc.nextLine();
	System.out.println("Enter employee House no: ");
	e.ad.hNo=sc.nextLine();
	System.out.println("Enter employee state name: ");
	e.ad.sName=sc.nextLine();
	System.out.println("Enter employee City: ");
	e.ad.city=sc.nextLine();
	System.out.println("Enter employee pincode: ");
	e.ad.pcode=sc.nextInt();
	e.getEmployee();
	//e.ad.getAddress();
	sc.close();
}
}
