package test;

public class Employee {
	public String eId,eName,eDesig;
	public Address ad;//reference variable
	
	public Employee(Address addr) {
		ad=addr;//initializing reference variable
	}
	public void getEmployee() {
		System.out.println("====EmployeeData====");
		System.out.println("Employee Id: "+eId);
		System.out.println("employee Name: "+eName);
		System.out.println("Employee Desig: "+eDesig);
		ad.getAddress();
	}

}
