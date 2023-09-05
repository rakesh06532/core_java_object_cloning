package ObjectCloning;
import java.util.*;

 class Employee implements Cloneable {   //Step1
	String name,id;
	Employee(String name,String id){
		this.name=name;
		this.id=id;
	}
	//Employee(){}
	public String toString() {
		return "Name="+name+"\nId="+id;
	}
	public Employee clone() throws CloneNotSupportedException //Step2
	{
		return (Employee)super.clone();
	}

}
public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Employee id: ");
		String id=sc.nextLine();
		Employee obj1=new Employee(name,id);
		System.out.println("Display from Original Object");
		System.out.println(obj1);
		System.out.println("hashcode of obj1: "+obj1.hashCode());
		Employee obj2=obj1.clone();  //Step3
		System.out.println("Display from clone object: ");
		System.out.println(obj2);
		System.out.println("hashcode of obj2: "+obj2.hashCode());
//		Employee ob1=new Employee();
//		Employee ob2=ob1.clone();
//		System.out.println(ob1.hashCode());
//		System.out.println(ob2.hashCode());
		sc.close();
	}
	
}
