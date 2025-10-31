package ioprograms;
import java.io.*;
class Employee implements Serializable
{
	int empId;
	String empName;
	transient double empSalary;//not included during serialization
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {}
	public String toString()
	{
		return "Emp Id : "+empId+"\n"+"Emp Name : "+empName+"\n"+"Emp Salary : "+empSalary;
	}
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		//Serialization
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee(101,"John",6000.0);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		//Deserialization
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee) ois.readObject();
		System.out.println(emp1);
		ois.close();
		fis.close();
	}

}
